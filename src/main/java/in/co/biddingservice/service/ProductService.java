package in.co.biddingservice.service;


import in.co.biddingservice.model.Product;

import java.util.List;

public interface ProductService {
	
	Product findById(Long id);

	Product findByName(String product_name);

	void saveProduct(Product product);

	void updateProduct(Product product);

	void deleteProductById(Long id);

	void deleteAllProducts();

	List<Product> findAllProdcts();

	boolean isProductExist(Product product);
}