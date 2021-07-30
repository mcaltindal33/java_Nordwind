package kodlamaio.nordwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.*;

import kodlamaio.nordwind.entities.concretes.Product;
import kodlamaio.nordwind.entities.dtos.ProductWithCategoryDto;

public interface ProductDao extends JpaRepository<Product, Integer> {
	
	List<Product> getByProductName(String productName);
	
	List<Product> getByProductNameAndCategories_CategoryId(String productName, int categoryId);
	
	List<Product> getByProductNameOrCategories_CategoryId(String productName, int categoryId);
	
	List<Product> getByCategories_CategoryIdIn(List<Integer> categories);
	
	List<Product> getByProductNameContains(String productName);
	
	List<Product> getByProductNameStartsWith(String productName);
	
	@Query("From Product where productName=:productName AND categories.categoryId=:categoryId")
	List<Product> GetByProductNameAndCategories(String productName, int categoryId);
	
	@Query("Select new kodlamaio.nordwind.entities.dtos.ProductWithCategoryDto(p.id,p.productName,c.name) productName From Category c Inner Join c.products p")
	List<ProductWithCategoryDto> getProductWithCategoryDetails();
}
