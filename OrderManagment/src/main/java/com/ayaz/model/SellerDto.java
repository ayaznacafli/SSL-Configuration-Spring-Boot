package com.ayaz.model;

import java.util.List;
import lombok.Data;

@Data
public class SellerDto {

    private long id;

    private String firstName;

    private String lastName;

    private String emailId;

    private List<Item> itemsSold;
}
