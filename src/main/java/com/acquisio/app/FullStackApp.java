package com.acquisio.app;

import com.acquisio.app.domain.Employee;
import com.acquisio.app.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/**
 * Main Spring-Boot app.
 */
@SpringBootApplication
public class FullStackApp {

    public static void main(String[] args) {
        SpringApplication.run(FullStackApp.class, args);
    }

    @Bean
    CommandLineRunner initializeDatabase(EmployeeRepository employeeRepository) {
        return (evt) -> {
            employeeRepository.save(Arrays.asList(
                    new Employee("John", "Smith", "onlinetest.acquisio+jsmith@gmail.com", 20000),
                    new Employee("Ava", "Muffinson", "onlinetest.acquisio+amuffinson@gmail.com", 10000),
                    new Employee("Cailin", "Ninson", "onlinetest.acquisio+cninson@gmail.com", 30000),
                    new Employee("Mike", "Peterson", "onlinetest.acquisio+mpeterson@gmail.com", 20000),
                    new Employee("Ian", "Peterson", "onlinetest.acquisio+ipeterson@gmail.com", 80000),
                    new Employee("John", "Mills", "onlinetest.acquisio+jmills@gmail.com", 50000)
            ));
        };
    }
}
