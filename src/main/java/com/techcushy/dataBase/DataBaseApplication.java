package com.techcushy.dataBase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.techcushy.dataBase.repositiory")
@SpringBootApplication
public class DataBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataBaseApplication.class, args);
	}

}
