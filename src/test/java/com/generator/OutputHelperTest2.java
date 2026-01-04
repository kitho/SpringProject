package com.generator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
@RunWith(SpringJUnit4ClassRunner.class)
// 加载核心xml配置文件，自动构建spring容器
@ContextConfiguration(locations="classpath:application-context.xml")
public class OutputHelperTest2
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
