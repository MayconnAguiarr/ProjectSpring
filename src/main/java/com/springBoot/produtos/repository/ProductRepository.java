package com.springBoot.produtos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.produtos.model.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{		
}
