package com.devsuperior.aula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.devsuperior.services.Order;
import com.devsuperior.services.OrderService;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class AulaApplication implements CommandLineRunner{
	
	@Autowired
	OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1309,95.9,0);
		
		System.out.println("Pedido codigo" + order.getCode());
		System.out.println("Valor total: R$" + orderService.total(order));
		
		
		
	}

}
