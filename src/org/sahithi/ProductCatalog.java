package org.sahithi;

import java.util.List;

import javax.jws.WebService;

import org.sahithi.business.ProductServiceImpl;
import org.sahithi.model.Product;
@WebService(endpointInterface="org.sahithi.ProductCatalogInterface", portName="TestMartCatalogPort", serviceName="TestMartCatalogService")

public class ProductCatalog implements ProductCatalogInterface {

	ProductServiceImpl productService = new ProductServiceImpl();
	
	@Override
	public List<String> getProductCategories() {
	
		return productService.getProductCategories();
	}
	
	@Override
	public List<String> getProducts(String category) {
	
		return productService.getProducts(category);
	}

	@Override
	public boolean addProduct(String category, String product) {
		
		return productService.addProduct(category, product);
	}
	
	
	@Override
	public List<Product> getProductsv2(String category) {
		
		return productService.getProductsv2(category);
	}

}
