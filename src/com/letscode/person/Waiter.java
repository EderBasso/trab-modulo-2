package com.letscode.person;

import com.letscode.Order;

import java.math.BigDecimal;

public class Waiter extends Person{

    public Waiter(String name, String surname, String cpf) {
        super(name, surname, cpf);
    }

    public Order takeOrder(Integer table){
        Order order = new Order();
        order.setTable(table);

        return order;
    }

    public BigDecimal closeBill(Integer table){
        BigDecimal totalPrice = new BigDecimal(0);
        return totalPrice;
    }
}
