package com.SpringCore.BeanInheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext resh= new ClassPathXmlApplicationContext("ConfigurationBean.xml");
        
        Employee emp = resh.getBean("employee", Employee.class);
        
        System.out.println(emp.getId()+"\t "+ emp.getName()+"\t"+ emp.getAddress()+"\t"+emp.getDepartment()+"\t"+ emp.getRole());
    }
}
