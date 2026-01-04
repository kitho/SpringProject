package com.generator;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OutputHelperTest1
{
    private static ApplicationContext context = null;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception
    {
        context = new ClassPathXmlApplicationContext("classpath:application-context.xml");
    }

    @Test
    public void testGenerateOutput()
    {
        OutputHelper outputHelper = (OutputHelper) context.getBean("OutputHelper");
        Assert.assertEquals("Csv Output Generator", outputHelper.generateOutput());
    }

    @Test
    public void testBuildOutput()
    {
        OutputHelper outputHelper = (OutputHelper) context.getBean("OutputHelper");
        Assert.assertEquals("Building CSV Output", outputHelper.buildOutput());
    }
}
