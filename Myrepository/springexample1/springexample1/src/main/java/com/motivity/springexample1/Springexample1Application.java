package com.motivity.springexample1;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Optional;

@SpringBootApplication
public class Springexample1Application implements CommandLineRunner  {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private  EmployeeRepository employeeRepository;
	public static void main(String[] args) {
		SpringApplication.run(Springexample1Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee=new Employee();
		employee.setAid(101);
		employee.setAname("venu");
		employee.setCompany("hp");
		employee.setAge(26);
		employeeRepository.save(employee);
//		jdbcTemplate.update("insert into employee values(?,?,?,?)",105,23,"sai","google");
		System.out.println(employeeRepository.findAll());
		jdbcTemplate.update("update  employee set aname=? where aid=?","sandeepkumar",104);
	}
}
