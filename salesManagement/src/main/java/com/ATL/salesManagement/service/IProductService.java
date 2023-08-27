package com.ATL.salesManagement.service;
import com.ATL.salesManagement.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void saveProduct(Product product);
    Product findById(Long id_product);
    void deleteProduct(Long id_product);
    void editProduct(Long id_product, String newName, String newBrand, int newAvailableQuantity, int newPrice);

}
