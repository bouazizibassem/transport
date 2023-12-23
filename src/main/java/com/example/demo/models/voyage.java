package com.example.demo.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "voyages")
public class voyage {
    @Id
    private String id;
    private String start;
    private String destination;
    private Integer prix;
    // Constructors, getters, setters, etc.
}
