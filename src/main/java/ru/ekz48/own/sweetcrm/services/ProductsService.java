package ru.ekz48.own.sweetcrm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ekz48.own.sweetcrm.db.ProductsRepository;
import ru.ekz48.own.sweetcrm.entities.db.ProductEntity;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductsService {

    ProductsRepository productsRepository;

    @Autowired
    public ProductsService(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public List<ProductEntity> getProducts() {
        List<ProductEntity> products = new ArrayList<>();
        productsRepository.findAll().forEach(products::add);
        return products;
    }

    public ProductEntity getById(Long id) {
        return productsRepository.findById(id).orElse(new ProductEntity());
    }

}
