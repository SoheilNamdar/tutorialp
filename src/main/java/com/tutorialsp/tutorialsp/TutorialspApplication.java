package com.tutorialsp.tutorialsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableAutoConfiguration(
		exclude = {
				DataSourceAutoConfiguration.class,
				HibernateJpaAutoConfiguration.class
		}
)
public class TutorialspApplication {
	public static void main(String[] args) {
		System.out.println("Marriage");
		ConfigurableApplicationContext context = SpringApplication.run(TutorialspApplication.class, args);
		Product product = context.getBean(Product.class);
		product.setName("Monitor");
		product.setPrice(1140);
		System.out.println(product.toString());
	}

}
