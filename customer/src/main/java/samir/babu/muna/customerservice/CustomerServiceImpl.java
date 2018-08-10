package samir.babu.muna.customerservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/customer/service")
public class CustomerServiceImpl {

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping
	public String getOrder(){
		String url = "http://order-service/rest/order/service";
		return restTemplate.getForObject(url, String.class);
}
}