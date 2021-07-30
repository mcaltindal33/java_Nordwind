package kodlamaio.nordwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlamaio.nordwind.business.abstracts.ProductService;
import kodlamaio.nordwind.core.utilities.results.*;
import kodlamaio.nordwind.entities.concretes.Product;
import kodlamaio.nordwind.entities.dtos.ProductWithCategoryDto;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
	
	private ProductService productService;
	
	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}


	@GetMapping("/getAll")
	public DataResult<List<Product>> getAll(){
		return this.productService.get();
	}
	
	@GetMapping("/getAllByPageNoPageSize")
	public DataResult<List<Product>> getAll(@RequestParam int pageNo,@RequestParam int pageSize){
		return this.productService.get(pageNo-1,pageSize);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Product product) {
		return this.productService.addProduct(product);
	}
	
	@PutMapping("/edit")
	public Result edit(@RequestBody Product product) {
		return this.productService.editProduct(product);
	}
	
	@GetMapping("/getByProductName")
	public DataResult<List<Product>> getByProductName(@RequestParam String productName){
		return this.productService.getByProductName(productName);
	}
	
	@GetMapping("/getByProductNameAndCategories")
	public DataResult<List<Product>> getByProductNameAndCategories(@RequestParam String productName,@RequestParam int categoryId){
		return this.productService.getByProductNameAndCategories(productName,categoryId);
	}
	
	@GetMapping("/getByProductNameOrCategories")
	public DataResult<List<Product>> getByProductNameOrCategories(@RequestParam String productName,@RequestParam int categoryId){
		return this.productService.getByProductNameOrCategories(productName,categoryId);
	}
	
	@GetMapping("/getByCategoriesIn")
	public DataResult<List<Product>> getByCategoriesIn(@RequestParam List<Integer> categories) {
		return this.productService.getByCategoriesIn(categories);
	}
	
	@GetMapping("/getByProductNameContains")
	public DataResult<List<Product>> getByProductNameContains(@RequestParam String productName){
		return this.productService.getByProductNameContains(productName);
	}
	
	@GetMapping("/getByProductNameStartWith")
	public DataResult<List<Product>> getByProductNameStartWith(@RequestParam String productName){
		return this.productService.getByProductNameStartWith(productName);
	}
	
	@GetMapping("/GetByNameAndCategories")
	public DataResult<List<Product>> GetByNameAndCategories(@RequestParam String productName,@RequestParam int categoryId) {
		return this.productService.GetByNameAndCategories(productName,categoryId);
	}
	
	@GetMapping("/GetAllSortedAsc")
	public DataResult<List<Product>> getSortedAsc(){
		return this.productService.getSortedAsc();
	}
	
	@GetMapping("/GetAllSortedDsc")
	public DataResult<List<Product>> getSortedDsc(){
		return this.productService.getSortedDsc();
	}
	
	@GetMapping("/getProductWithCategoryDetails")
	public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails(){
		return this.productService.getProductWithCategoryDetails();
	}
}
