package com.example.demojpa.controller;

import com.example.demojpa.entity.Product;
import com.example.demojpa.service.CouponService;
import com.example.demojpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private CouponService couponService;

    @GetMapping("/products")
    public String getAll(Model model) {
        model.addAttribute("products", productService.getAllProductsByJdbcButHarder());
        model.addAttribute("coupons", couponService.getAll());
        model.addAttribute("an", "Xuân An");
        return "product";
    }
}
