package learn.api.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EntityScan(basePackages = {"learn.api.rest"})
@ComponentScan(basePackages = {"learn.*"})
@EnableJpaRepositories(basePackages = {"learn.api.rest.repository"})
@EnableTransactionManagement
@RestController
@EnableAutoConfiguration
public class LearnspringrestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnspringrestapiApplication.class, args);
	}

}
