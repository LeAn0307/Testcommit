package com.example.demojpa.repository;

import com.example.demojpa.entity.Coupon;
import com.example.demojpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon, Long> {

}
