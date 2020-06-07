package com.arun.dao;

import com.arun.entity.ProductDetails;

public class ShoppingDao {
	
	public void logic() {
		ProductDetails pd = new ProductDetails();
	
		System.out.println(pd.getProductId()+pd.getProductName());
	}

}
