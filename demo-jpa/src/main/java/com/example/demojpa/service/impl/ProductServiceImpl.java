package com.example.demojpa.service.impl;

import com.example.demojpa.entity.Product;
import com.example.demojpa.repository.ProductJdbcRepository;
import com.example.demojpa.repository.ProductRepository;
import com.example.demojpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductJdbcRepository productJdbcRepository;

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getAllProductsByJdbc() {
        return productJdbcRepository.getAllProductsByJdbc();
    }

    @Override
    public List<Product> getAllProductsByJdbcButHarder() {
        return productJdbcRepository.getAllProductsByJdbcButHarder();
    }
}
