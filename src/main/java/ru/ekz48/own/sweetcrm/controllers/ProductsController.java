package ru.ekz48.own.sweetcrm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import ru.ekz48.own.sweetcrm.entities.api.Product;
import ru.ekz48.own.sweetcrm.services.ProductsService;

import java.util.List;

@RestController
public class ProductsController {

    private ProductsService productsService;

    @Autowired
    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    public List<Product> getProducts() {
        //return productsService.getProducts();
        return null;
    }
}
