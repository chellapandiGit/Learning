package com.learn.cianddi;

public class Employee {

    private String name;

    private int id;

    private Address address;

    public Employee(String name, int id, Address address) {
        super();
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public void getEmployeeDetails() {
        address.getAddress();
        System.out.println(name + "  " + id);

    }

}
