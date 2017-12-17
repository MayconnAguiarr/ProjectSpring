package com.springBoot.produtos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springBoot.produtos.model.Product;
import com.springBoot.produtos.services.ProductService;

@Controller
@RequestMapping(value = "/products")
public class ProductController{
	
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public ModelAndView list(){
		
		List<Product> productsList = productService.list();		
		ModelAndView modelAndView = new ModelAndView("products/productsList");		
		modelAndView.addObject("products", productsList );		
		return modelAndView;		
	}
}
