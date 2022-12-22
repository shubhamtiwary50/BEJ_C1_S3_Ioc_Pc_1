package org.niit;

import org.niit.config.AppConfig;
import org.niit.domain.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );

        ApplicationContext appcontext = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee = appcontext.getBean(Employee.class);
        System.out.println(employee);

    }
}
