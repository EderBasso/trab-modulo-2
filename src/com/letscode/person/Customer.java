package com.letscode.person;

public class Customer extends Person {
    private String phone;
    private String address;

    public Customer(String name, String surname, String cpf) {
        super(name, surname, cpf);
    }
}
