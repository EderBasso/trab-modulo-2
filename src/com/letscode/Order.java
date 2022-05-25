package com.letscode;

import com.letscode.person.Customer;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order {
    private Integer table;
    private LocalDateTime placement;
    private boolean delivery = false;
    private Customer customer;
    //private ArrayList<Product> items;
    private BigDecimal totalPrice;


    public Order() {
    }

    public Integer getTable() {
        return table;
    }

    public void setTable(Integer table) {
        this.table = table;
        if (table == 0){
            delivery = true;
        }
    }
}
