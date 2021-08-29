package com.test.entity;

import lombok.Data;

import java.util.List;

/**
 * @ClassName MyTable
 * @Description TODO
 * @Author 101217
 * @Date 2021/8/24 11:35
 */
@Data
public class MyDataInfo {
    private String databaseName;
    private List<MyTable>myTables;
    private String tableDescription;
    @Data
    public static class MyTable{
        private String tableName;
    }

    @Data
    public static class MyColumn{
        private String columnName;
        private String columnDescription;
    }
}
