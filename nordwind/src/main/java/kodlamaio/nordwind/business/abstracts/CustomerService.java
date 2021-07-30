package kodlamaio.nordwind.business.abstracts;

import java.util.List;

import kodlamaio.nordwind.entities.concretes.Customer;

public interface CustomerService {
	List<Customer> getAll();
}
