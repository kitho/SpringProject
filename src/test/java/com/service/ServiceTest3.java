package com.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {ServiceImpl.class})
public class ServiceTest3
{
    @Autowired
    private Service service;

    @Test
    public void testPrintHello()
    {
        service.setName("John");
        Assert.assertEquals("Hello ! John", service.printHello());
    }
}
