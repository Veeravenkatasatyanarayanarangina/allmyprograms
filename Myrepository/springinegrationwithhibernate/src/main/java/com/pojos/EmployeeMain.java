package com.pojos;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeMain
{
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContext.xml");


        BeanFactory factory = new XmlBeanFactory(resource);
        EmployeeDao employeeDao =factory.getBean(EmployeeDao.class);
      // =(EmployeeDao)factory.getBean("d");



        Employee e = new Employee();
        e.setEid(108);
        e.setName("venu");
        e.setDept("development");
        e.setDesignation("java");
       // employeeDao.updateEmployee(e);
        //employeeDao.saveEmployee(e);
        employeeDao.getDetails().stream().forEach(System.out::println);
    }
}
