package in.co.biddingservice.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import in.co.biddingservice.model.Product;
import in.co.biddingservice.repositories.ProductRepository;



@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;

	public Product findById(Long id) {
		return productRepository.findOne(id);
	}

	public Product findByName(String product_name) {
		return productRepository.findByName(product_name);
	}
	

	public void saveProduct(Product product) {
		productRepository.save(product);
	}

	public void updateProduct(Product product) {
		saveProduct(product);
	}

	public void deleteProductById(Long id) {
		productRepository.delete(id);
	}

	public void deleteAllProducts() {
		productRepository.deleteAll();
	}

	public List<Product> findAllProdcts() {
		return productRepository.findAll();
	}

	public boolean isProductExist(Product product) {
		return findByName(product.getProduct_name()) != null;
	}



	
}
