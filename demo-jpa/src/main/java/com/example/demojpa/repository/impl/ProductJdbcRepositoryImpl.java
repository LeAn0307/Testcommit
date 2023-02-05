package com.example.demojpa.repository.impl;

import com.example.demojpa.entity.Product;
import com.example.demojpa.repository.ProductJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductJdbcRepositoryImpl implements ProductJdbcRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Product> getAllProductsByJdbc() {
        return jdbcTemplate.query("SELECT * FROM Product", BeanPropertyRowMapper.newInstance(Product.class));
    }

    public List<Product> getAllProductsByJdbcButHarder() {
        return jdbcTemplate.query("SELECT * FROM Product",
                (rs, rowNum) -> new Product(
                        rs.getLong("id"),
                        rs.getString("name")
                ));
    }
}
