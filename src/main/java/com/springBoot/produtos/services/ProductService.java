package com.springBoot.produtos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.produtos.dtos.ProductDto;
import com.springBoot.produtos.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<ProductDto> list(){
		return productRepository.findAll();				
	}

}
