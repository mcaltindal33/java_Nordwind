package kodlamaio.nordwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import kodlamaio.nordwind.business.abstracts.ProductService;
import kodlamaio.nordwind.core.utilities.results.DataResult;
import kodlamaio.nordwind.core.utilities.results.Result;
import kodlamaio.nordwind.core.utilities.results.SuccessDataResult;
import kodlamaio.nordwind.core.utilities.results.SuccessResult;
import kodlamaio.nordwind.dataAccess.abstracts.ProductDao;
import kodlamaio.nordwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {
	
	
	private ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> get() {
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data Listelendi.");
	}

	@Override
	public Result addProduct(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Yeni Ürün Eklendi");
		
	}

	@Override
	public Result editProduct(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Ürün Güncellendi");
	}

	@Override
	public DataResult<List<Product>> getByProductName(String productName) {
		
		return new SuccessDataResult<List<Product>>(this.productDao.getByProductName(productName),"Data Listelendi");
	}

	@Override
	public DataResult<List<Product>> getByProductNameAndCategories(String productName, int categoryId) {
		return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameAndCategories_CategoryId(productName,categoryId),"Data Listelendi");
	}

	@Override
	public DataResult<List<Product>> getByProductNameOrCategories(String productName, int categoryId) {
		return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameOrCategories_CategoryId(productName,categoryId),"Data Listelendi.");
	}

	@Override
	public DataResult<List<Product>> getByCategoriesIn(List<Integer> categories) {
		return new SuccessDataResult<List<Product>>(this.productDao.getByCategories_CategoryIdIn(categories),"Data Listelendi.");
	}

	@Override
	public DataResult<List<Product>> getByProductNameContains(String productName) {
		return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameContains(productName),"Data Listelendi.");
	}

	@Override
	public DataResult<List<Product>> getByProductNameStartWith(String productName) {
		return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameStartsWith(productName),"Data Listelendi.");
	}

	@Override
	public DataResult<List<Product>> GetByNameAndCategories(String productName, int categoryId) {
		return new SuccessDataResult<List<Product>>(this.productDao.GetByProductNameAndCategories(productName,categoryId),"Data Listelendi.");
	}

	@Override
	public DataResult<List<Product>> get(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo, pageSize);
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(pageable).getContent(),"Data Listelendi.");
	}

	@Override
	public DataResult<List<Product>> getSortedAsc() {
		Sort sort = Sort.by(Sort.Direction.ASC,"productName");
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(sort),"Data Listelendi.");
	}

	@Override
	public DataResult<List<Product>> getSortedDsc() {
		Sort sort = Sort.by(Sort.Direction.DESC,"productName");
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(sort),"Data Listelendi.");
	}
	

}
