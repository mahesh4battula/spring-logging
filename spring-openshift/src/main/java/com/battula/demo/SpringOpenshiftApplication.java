package com.battula.demo;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringOpenshiftApplication {
	
	Logger logger=LoggerFactory.getLogger(SpringOpenshiftApplication.class);


@GetMapping("/")
public String hello() {
	logger.info("info hello");
	return "Hello battula";
	
}
@GetMapping("/{name}")
public String helloname(@PathVariable String name) {
	logger.info("info hello {}"+ name);
	return "Hello battula"+name;
	
}

	public static void main(String[] args) {
		SpringApplication.run(SpringOpenshiftApplication.class, args);
	}

}
