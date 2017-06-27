package com.example.elastic.model;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.Data;

/**
 * @author iago
 */
@Document(indexName = "customer", type = "customer", refreshInterval = "-1")
public @Data class Customer {

    @Id
    private Long id;

    private String name;

    private String phone;

    private List<Level1> level1;

    private Map<String,String> map;
}
