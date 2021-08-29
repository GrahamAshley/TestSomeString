package com.test.mapper;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @ClassName TestMongoMapper
 * @Description TODO
 * @Author 101217
 * @Date 2021/8/24 10:19
 */
public interface TestMongoMapper extends MongoRepository<TestMongoMapper,String> {
}
