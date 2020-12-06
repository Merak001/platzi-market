package com.puchungis.platzimarket.domain.repository;

import java.util.List;
import java.util.Optional;

import com.puchungis.platzimarket.domain.Product;

public interface ProductoRepository {
    //Con esta Interface se va  indicar como se deben de compartar todos los repositorios
    List<Product> getAll();
    Optional<List<Product>> getByCatergory(int categoryId);  
    //Que cantidad de productos son escaso ejem.  20 
    Optional<List<Product>> getScarseProducts(int quantity);
    Optional<Product> getProduct(int produictID);
    Product save(Product product);
    void delete (int productId);
}
