package com.example.repositories;

import com.example.entity.AmazonOrderStatusEventTmp;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Osada
 * @created 05/01/2025
 */
public interface AmazonOrderStatusTmpRepository extends MongoRepository<AmazonOrderStatusEventTmp, String> {
}
