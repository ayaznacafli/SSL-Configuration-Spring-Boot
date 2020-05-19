package com.ayaz.dto;

import lombok.Data;

@Data
public class Item {

    private long id;
    private String name;
    private String category;
    private double price;//per item
}
