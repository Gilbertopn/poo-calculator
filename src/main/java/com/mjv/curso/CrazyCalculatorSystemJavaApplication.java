package com.mjv.curso;

import com.mjv.curso.model.Calculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrazyCalculatorSystemJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrazyCalculatorSystemJavaApplication.class, args);

		Calculator calculator = new Calculator();
		calculator.crazyCalculator();

	}

}
