package samir.babu.muna.orderservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/order/service")
public class OrderServiceImpl {

	@GetMapping
	public String hello(){
		return "hello...";
	}
}