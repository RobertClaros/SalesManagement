package com.ATL.salesManagement.service;

import com.ATL.salesManagement.model.Product;
import com.ATL.salesManagement.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductService implements IProductService {
    @Autowired
    IProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        List<Product> productList = productRepository.findAll();

        return productList;
    }

    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);

    }

    @Override
    public Product findById(Long id_product) {
        Product product = (Product) productRepository.findById(id_product).orElse(null);
        return product;
    }

    @Override
    public void deleteProduct(Long id_product) {
        productRepository.deleteById(id_product);
    }

    @Override
    public void editProduct(Long id_product, String newName, String newBrand, int newAvailableQuantity, int newPrice) {
        Product product = findById(id_product);
        product.setName(newName);
        product.setBrand(newBrand);
        product.setAvailableQuantity(newAvailableQuantity);
        product.setPrice(newPrice);
    }
}
