package com.generator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OutputHelperTestConfig
{
    @Bean
    public IOutputGenerator outputGenerator()
    {
        return new CsvOutputGenerator();
    }

//    @Bean
//    public OutputHelper outputHelper()
//    {
//        return new OutputHelper(outputGenerator());
//    }
}
