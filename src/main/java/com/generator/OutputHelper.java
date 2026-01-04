package com.generator;

public class OutputHelper
{
    private IOutputGenerator outputGenerator;

    public void setOutputGenerator(IOutputGenerator outputGenerator){
        this.outputGenerator = outputGenerator;
    }

    public String generateOutput(){
        return outputGenerator.generateOutput();
    }

    public String buildOutput(){
        return outputGenerator.buildOutput();
    }
}
