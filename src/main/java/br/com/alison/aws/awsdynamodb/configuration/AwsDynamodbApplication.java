package br.com.alison.aws.awsdynamodb.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.alison.aws.awsdynamodb")
public class AwsDynamodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsDynamodbApplication.class, args);
	}

}
