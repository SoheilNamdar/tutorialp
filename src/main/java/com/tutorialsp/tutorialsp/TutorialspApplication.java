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
				HibernateJpaAutoConfiguration.class
		}
)
public class TutorialspApplication {
	public static void main(String[] args) {
		System.out.println("Hello");
		ConfigurableApplicationContext context = SpringApplication.run(TutorialspApplication.class, args);
		Product product1 = context.getBean(Product.class);
		product1.setName("Monitor");
		product1.setPrice(1140);
		System.out.println(product1.toString());
		Product product2 = (Product) context.getBean("product");
		product2.setName("Monitor");
		product2.setPrice(1140);
		System.out.println(product2.toString());
		Product product = context.getBean(Product.class);
		product.user.setEmail("soheilnamdar@yhaoo.com");
		System.out.println(product.user.getEmail());
	}

}
