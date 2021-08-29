package com.test.pa;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.awt.*;
import java.awt.TrayIcon.MessageType;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

@Component
public class Pa {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired//RabbitTemplate是模板对象,用来简化mq操作
    private RabbitTemplate rabbitTemplate;
    String url="https://express.baidu.com/express/api/express?query_from_srcid=&isBaiduBoxApp=10002&isWisePc=10020&tokenV2=2y2w0i_BczzsZUChpBL_kO8EzM1WQ5j0b_W05C3znrLfoyVprSbAmP9S-0QfCtAY&cb=jQuery110205215292072665794_1622093737203&appid=4001&com=shentong&nu=777045270829000&vcode=&token=&qid=fe8565bf000d5804&_=1622093737205";
    String l="http://f3.htqyy.com/play9/33/mp3/5";
    String test="http://172.16.9.84:9530/building//api/bapp/customer/building/getArticleContent";
    public void getall() throws AWTException, IOException, InterruptedException {

    }



    public void displayTray() throws AWTException, IOException {
        SystemTray tray = SystemTray.getSystemTray();
        ClassPathResource classPathResource = new ClassPathResource("a.jpg");
        String absolutePath = classPathResource.getFile().getAbsolutePath();
        //If the icon is a file
        Image image = Toolkit.getDefaultToolkit().createImage(absolutePath);
        //Alternative (if the icon is on the classpath):
        //Image image = Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png"));
        TrayIcon trayIcon = new TrayIcon(image, "Java AWT Tray Demo");
        //Let the system resize the image if needed
        trayIcon.setImageAutoSize(true);
        //Set tooltip text for the tray icon
        trayIcon.setToolTip("System tray icon demo");
        tray.add(trayIcon);
        trayIcon.displayMessage("Hello, World", "Java Notification Demo", MessageType.INFO);
    }


    private void change() throws IOException {
        int rowStart=3;//row从0开始
        int rowEnd=12;
        int columnStart=3;//列从1开始
        int columnEnd=21;
        File file = new File("C:\\Users\\user\\Downloads\\客户池1.0开发互评.xlsx");
        if (!file.exists()){
            file.createNewFile();
        }
        FileInputStream inputStream=new FileInputStream(file);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);
       do{
           Row row2 = sheet.getRow(13);
           for (int m=columnStart;m<=columnEnd;m++){
               row2.getCell(m).setCellValue(0);
           }
            System.out.println("----------");
            for (int i=rowStart;i<=rowEnd;i++){
                Row row = sheet.getRow(i);
                Row row1 = sheet.getRow(13);
                for (int m=columnStart;m<=columnEnd;m++){
                    row.getCell(m).setCellValue(new Random().nextInt(2)+9);
                    row1.getCell(m).setCellValue(row1.getCell(m).getNumericCellValue()+row.getCell(m).getNumericCellValue());
                }
            }
        } while (sheet.getRow(13).getCell(15).getNumericCellValue()<=90);
        inputStream.close();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        workbook.write(fileOutputStream);

        fileOutputStream.close();
    }
}
