package com.test.config;

import org.apache.poi.ss.usermodel.*;
import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;
import org.springframework.boot.system.JavaVersion;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import javax.annotation.PostConstruct;
import java.io.*;

/**
 * @ClassName GetWorkbook
 * @Description TODO
 * @Author 101217
 * @Date 2021/8/24 12:04
 */
@Component
@ConditionalOnJava(value = JavaVersion.FIFTEEN)
public class GetWorkbook {

    private InputStream inputStream;
    private File file;
    private Workbook workbook;
    private OutputStream outputStream;
    @PostConstruct
    public void init() throws Exception {
        this.file = new File("C:\\Users\\user\\Desktop\\a.xlsx");
        if (!file.exists() || !"xlsx".equals(getFileExtension(file))){
            throw new  Exception();
        }
        this.inputStream=new FileInputStream(file);
        this.workbook = WorkbookFactory.create(inputStream);
        Sheet sheetAt = workbook.getSheetAt(0);
        Row row = sheetAt.createRow(0);
        row.createCell(0).setCellValue("数据库名");
        row.createCell(1).setCellValue("表名");
        row.createCell(2).setCellValue("字段名");
    }

    public void printIntoExcel(String databaseName,String tableName,String column,boolean separate) throws IOException {
        Sheet sheet = this.workbook.getSheetAt(0);
        Row row = sheet.getRow(sheet.getLastRowNum());
        if ((!ObjectUtils.isEmpty(row.getCell(0)) && row.getCell(0).getStringCellValue().equals(databaseName)) && (!ObjectUtils.isEmpty(row.getCell(1)) && row.getCell(1).getStringCellValue().equals(tableName))){
            short lastCellNum = row.getLastCellNum();
            Cell cell = row.createCell(lastCellNum + 1);
            if (separate){
                cell.setCellValue(column+"(逗号分隔)");
            }else {
                cell.setCellValue(column);
            }
        }else {
            Row row1 = sheet.createRow(sheet.getLastRowNum() + 1);
            row1.createCell(0).setCellValue(databaseName);
            row1.createCell(1).setCellValue(tableName);
            if (separate){
                row1.createCell(2).setCellValue(column+"(逗号分隔)");
            }else {
                row1.createCell(2).setCellValue(column);
            }
        }
        this.outputStream = new FileOutputStream(this.file);
        this.workbook.write(this.outputStream);
    }

    public void close() throws IOException {
        this.inputStream.close();
        this.outputStream.close();
    }

    private static String getFileExtension(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }
}
