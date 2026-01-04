package com.service;

public class Task
{
    private Service service;

    public void setService(Service service)
    {
        this.service = service;
    }

    public String execute() {
        return service.printHello();
    }
}
