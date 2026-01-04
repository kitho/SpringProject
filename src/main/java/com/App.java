package com;

import com.generator.OutputHelper;
import com.service.Task;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "application-context.xml");

        OutputHelper outputHelper = (com.generator.OutputHelper) context.getBean("OutputHelper");
        System.out.println(outputHelper.generateOutput());

        Task task = (com.service.Task) context.getBean("Task");
        task.execute();
    }
}
