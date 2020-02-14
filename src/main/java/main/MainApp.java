package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xmlBased.Employee;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "AppContext.xml");
        Employee employee = (Employee) applicationContext.getBean("employee");
        /*Employee employee = (Employee) applicationContext.getBean("employeeName");*/
        System.out.println("Employee details fetched from application context : " );
        employee.print();
    }
}
