package samir.babu.muna.orderbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

//@EnableDiscoveryClient
@EnableAutoConfiguration
@EnableEurekaClient
@ComponentScan({"samir.babu.muna"})
@SpringBootApplication
public class OrderbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderbackendApplication.class, args);
	}
}
