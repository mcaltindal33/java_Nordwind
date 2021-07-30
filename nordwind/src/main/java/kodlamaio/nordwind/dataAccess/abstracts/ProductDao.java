package kodlamaio.nordwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.*;

import kodlamaio.nordwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {
	
	List<Product> getByProductName(String productName);
	
	List<Product> getByProductNameAndCategories_CategoryId(String productName, int categoryId);
	
	List<Product> getByProductNameOrCategories_CategoryId(String productName, int categoryId);
	
	List<Product> getByCategories_CategoryIdIn(List<Integer> categories);
	
	List<Product> getByProductNameContains(String productName);
	
	List<Product> getByProductNameStartsWith(String productName);
	
	@Query("From Product where productName=:productName AND categories.categoryId=:categoryId")
	List<Product> GetByProductNameAndCategories(String productName, int categoryId);
}
