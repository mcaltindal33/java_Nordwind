package kodlamaio.nordwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.nordwind.business.abstracts.CustomerService;
import kodlamaio.nordwind.entities.concretes.Customer;

@RestController
@RequestMapping("/api/customers")
public class CustomersController {
	private CustomerService customerService;

	@Autowired
	public CustomersController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
	@GetMapping("/getall")
	public List<Customer> getAll(){
		return this.customerService.getAll(); 
	}
}
