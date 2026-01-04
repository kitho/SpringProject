package com.generator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {OutputHelperTestConfig.class})
public class OutputHelperTest3
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

}
