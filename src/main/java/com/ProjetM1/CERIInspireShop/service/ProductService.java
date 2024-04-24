package com.ProjetM1.CERIInspireShop.service;

import com.ProjetM1.CERIInspireShop.dto.ProductDto;
import com.ProjetM1.CERIInspireShop.model.Product;

import java.util.List;

public interface ProductService {
    List<ProductDto> getAllProducts();
    List<ProductDto> getProductOfCategoryById(Long categoryId);
}
