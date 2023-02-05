package com.example.demojpa.service.impl;

import com.example.demojpa.entity.Coupon;
import com.example.demojpa.repository.CouponRepository;
import com.example.demojpa.repository.ProductRepository;
import com.example.demojpa.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CouponServiceImpl implements CouponService {

    @Autowired
    private CouponRepository couponRepository;

    @Override
    public List<Coupon> getAll() {
        return couponRepository.findAll();
    }
}
