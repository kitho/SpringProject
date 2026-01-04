package com.generator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = OutputHelperTest3.class)
public class OutputHelperTest3 implements ApplicationContextAware
{
    @Autowired
    private OutputHelper outputHelper;

    @Test
    public void testGenerateOutput()
    {
        Assert.assertEquals("Csv Output Generator", outputHelper.generateOutput());
    }

    @Test
    public void testBuildOutput()
    {
        Assert.assertEquals("Building CSV Output", outputHelper.buildOutput());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
    {
        applicationContext = new ClassPathXmlApplicationContext("classpath:application-context.xml");
    }
}
