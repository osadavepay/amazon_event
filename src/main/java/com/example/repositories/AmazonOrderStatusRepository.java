package com.example.repositories;

import com.example.entity.AmazonOrderStatusEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Osada
 * @created 05/01/2025
 */
public interface AmazonOrderStatusRepository extends MongoRepository<AmazonOrderStatusEvent,String> {
}
