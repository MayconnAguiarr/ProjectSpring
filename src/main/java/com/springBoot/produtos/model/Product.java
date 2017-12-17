package com.springBoot.produtos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private double amount;
	
	private double vlr;
	
	private String description;

	public Long getId(){
		return id;
	}

	public void setId(Long id){
		this.id = id;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public double getAmount(){
		return amount;
	}

	public void setAmount(double amount){
		this.amount = amount;
	}

	public double getVlr(){
		return vlr;
	}

	public void setVlr(double vlr){
		this.vlr = vlr;
	}

	public String getDescription(){
		return description;
	}

	public void setDescription(String description){
		this.description = description;
	}	
}
