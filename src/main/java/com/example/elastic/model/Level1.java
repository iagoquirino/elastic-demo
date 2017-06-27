package com.example.elastic.model;

import java.util.List;
import java.util.Map;

import lombok.Data;

/**
 * @author iago
 */
public @Data class Level1 {

    private String value;

    private List<Level2> level2;

    private Map<String,String> map;

}
