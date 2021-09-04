package com.test.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "CustomerRadarOperate")
public class MongoTest {
//    static {
//        System.out.println();
//    }
//    @Id
//    private String id;
//    @Field(value ="operateTime" ,targetType = FieldType.DATE_TIME)
//    private Date operateTime;
//    private Integer count;
////    @Field("user_id")
////    private String userId;
////    @Field("age")
////    private Integer age;
////    @Field("status")
////    private String status;
    @Field(value = "title")
    private String title;
}
