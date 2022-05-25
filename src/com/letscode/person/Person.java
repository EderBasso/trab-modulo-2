package com.letscode.person;

public abstract class Person {
    public String name;
    public String surname;
    public String cpf;

    public Person(String name, String surname, String cpf) {
        this.name = name;
        this.surname = surname;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCpf() {
        return cpf;
    }
}
