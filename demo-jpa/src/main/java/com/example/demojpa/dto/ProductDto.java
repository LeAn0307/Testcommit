package com.example.demojpa.dto;

import lombok.*;

import javax.persistence.Table;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private Long id;
    private String name;
}
