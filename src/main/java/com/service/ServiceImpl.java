package com.service;

public class ServiceImpl implements Service
{
    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String printHello() {
        return "Hello ! " + name;
    }
}
