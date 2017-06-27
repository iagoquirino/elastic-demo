package com.example.elastic.model;

import java.util.List;
import java.util.Map;

import lombok.Data;

/**
 * @author iago
 */
public @Data class Level2 {

    private String value;

    private List<Level3> level3;

    private Map<String,String> map;

}
