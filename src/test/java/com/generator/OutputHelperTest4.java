package com.generator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations={"classpath:application-context.xml"})
public class OutputHelperTest4 extends AbstractJUnit4SpringContextTests
{
    @Autowired
    private ApplicationContext context;

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
