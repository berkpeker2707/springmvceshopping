package com.springmvc.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springmvc.model.Product;
import com.springmvc.repository.ProductRepository;

@Component
public class DataLoader implements CommandLineRunner {

	private ProductRepository productRepository;

	@Autowired
	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public void run(String... args) throws Exception {

		Product product1 = new Product();
		product1.setName("Milky Bar");
		product1.setDescription("Milky Bar with chocolate and hazelnut.");
		product1.setType("Candies");
		product1.setCategory("Bars");
		product1.setPrice(5.00);

		productRepository.save(product1);

		Product product2 = new Product();
		product2.setName("Almond Bar");
		product2.setDescription("Almond Bar with milky chocolate and honey.");
		product2.setType("Candies");
		product2.setCategory("Bars");
		product2.setPrice(10.00);

		productRepository.save(product2);
	}
}
