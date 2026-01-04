package com.service;

public class ServiceImpl implements Service
{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printHello() {
        System.out.println("Hello ! " + name);
    }
}
