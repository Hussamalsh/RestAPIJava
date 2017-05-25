package com.example;

import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;

@SpringBootApplication
@EnableOAuth2Sso
public class DemoApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);


	 
	
	@RequestMapping("/user")
	  public Principal user(Principal principal) {
	    return principal;
	  }
	  
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	/*@Bean
	public CommandLineRunner setup(EmployeeRepository employeeRepository){
		return (args) ->
		{
			employeeRepository.save(new Employee("Gustan","ponce", true));
			employeeRepository.save(new Employee("John","Smith", true));
			employeeRepository.save(new Employee("Jim","Morris", true));
			employeeRepository.save(new Employee("David","Gilmour", true));
			
			logger.info("The sample data has been generated");





spring.data.jpa.repositories.enabled
spring.jpa.database
spring.jpa.database-platform
#spring.jpa.generate-ddl
spring.jpa.hibernate.ddl-auto
spring.jpa.hibernate.naming.implicit-strategy
spring.jpa.hibernate.naming.physical-strategy
#spring.jpa.hibernate.use-new-id-generator-mappings
spring.jpa.open-in-view
spring.jpa.properties.*
spring.jpa.show-sql = true







		};
		
	}*/
}
