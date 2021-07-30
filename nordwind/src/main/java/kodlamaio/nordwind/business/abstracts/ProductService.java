package kodlamaio.nordwind.business.abstracts;

import java.util.List;


import kodlamaio.nordwind.core.utilities.results.*;
import kodlamaio.nordwind.entities.concretes.*;
import kodlamaio.nordwind.entities.dtos.ProductWithCategoryDto;

public interface ProductService {
	
	DataResult<List<Product>> get();
	
	DataResult<List<Product>> get(int pageNo,int pageSize);
	DataResult<List<Product>> getSortedAsc();
	DataResult<List<Product>> getSortedDsc();
	
	Result addProduct(Product product);
	
	Result editProduct(Product product);
	
	DataResult<List<Product>> getByProductName(String productName);
	
	DataResult<List<Product>> getByProductNameAndCategories(String productName, int categoryId);
	
	DataResult<List<Product>> getByProductNameOrCategories(String productName, int categoryId);
	
	DataResult<List<Product>> getByCategoriesIn(List<Integer> categories);
	
	DataResult<List<Product>> getByProductNameContains(String productName);
	
	DataResult<List<Product>> getByProductNameStartWith(String productName);
		
	DataResult<List<Product>> GetByNameAndCategories(String productName, int categoryId);
	
	DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails();
	
}
