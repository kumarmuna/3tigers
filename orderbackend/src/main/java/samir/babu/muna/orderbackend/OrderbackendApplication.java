package samir.babu.muna.orderbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class OrderbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderbackendApplication.class, args);
	}
}
