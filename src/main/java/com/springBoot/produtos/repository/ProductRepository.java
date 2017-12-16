package com.springBoot.produtos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.produtos.dtos.ProductDto;

public interface ProductRepository extends JpaRepository<ProductDto,Long>{
	
	

}
