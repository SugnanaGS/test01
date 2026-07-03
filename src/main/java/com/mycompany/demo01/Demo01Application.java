package com.mycompany.demo01;

import java.util.ti,e.*
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo01Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo01Application.class, args);
		System.out.println("Demo01Application : " + LocalTime.now());
	}

}
