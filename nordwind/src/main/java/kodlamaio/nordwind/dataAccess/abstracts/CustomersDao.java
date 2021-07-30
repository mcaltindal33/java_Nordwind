package kodlamaio.nordwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.nordwind.entities.concretes.Customer;

public interface CustomersDao extends JpaRepository<Customer, Integer> {

}
