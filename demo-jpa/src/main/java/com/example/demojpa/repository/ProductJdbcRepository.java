package com.example.demojpa.repository;

import com.example.demojpa.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductJdbcRepository {
    public List<Product> getAllProductsByJdbc();
    public List<Product> getAllProductsByJdbcButHarder();
}
