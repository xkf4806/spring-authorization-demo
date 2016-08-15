package io.hexin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class SpringAuthorizationDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAuthorizationDemoApplication.class, args);
	}
}
