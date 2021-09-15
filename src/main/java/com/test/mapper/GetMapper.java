package com.test.mapper;

import com.test.entity.MyDataInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface GetMapper {
    List<String> getDatebase();

    List<MyDataInfo>getDatabaseInfo();

    List<MyDataInfo.MyColumn> getColumn(@Param("databaseName")String databaseName,@Param("tableName")String tableName);

    Integer testDateQuery(Date date);

    void insertT(int i);
}
