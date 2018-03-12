package com.learn.cianddi;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeCaller {

    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory bean = new XmlBeanFactory(resource);
        Employee employee=(Employee)bean.getBean("employee");
        employee.getEmployeeDetails();

    }
}
