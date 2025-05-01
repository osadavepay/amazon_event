package com.example.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Osada
 * @created 05/01/2025
 */
@NoArgsConstructor
@Data
@Document
public class AmazonOrderStatusEvent {
    @Id
    private String id;
    private String content;
}
