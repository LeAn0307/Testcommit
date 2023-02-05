package com.example.demojpa.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Coupon {
    @Id
    private Long id;
    private String name;
}
