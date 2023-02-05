package com.example.demojpa.service;

import com.example.demojpa.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    public List<Product> getAll();
    public List<Product> getAllProductsByJdbc();
    public List<Product> getAllProductsByJdbcButHarder();
}
