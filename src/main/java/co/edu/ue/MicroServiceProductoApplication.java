package co.edu.ue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan({"co.edu.ue.model"})
@EnableJpaRepositories(basePackages = {"co.edu.eu.dao"})
@ComponentScan(basePackages = {"co.edu.ue.service","co.edu.ue.controller","co.edu.ue.dao"})
public class MicroServiceProductoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceProductoApplication.class, args);
	}

}
