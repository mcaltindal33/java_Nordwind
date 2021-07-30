package kodlamaio.nordwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.nordwind.business.abstracts.CustomerService;
import kodlamaio.nordwind.dataAccess.abstracts.CustomersDao;
import kodlamaio.nordwind.entities.concretes.Customer;

@Service
public class CustomerManager implements CustomerService {
	private CustomersDao customersDao;

	@Autowired
	public CustomerManager(CustomersDao customersDao) {
		super();
		this.customersDao = customersDao;
	}

	@Override
	public List<Customer> getAll() {
		return this.customersDao.findAll();
	} 

}
