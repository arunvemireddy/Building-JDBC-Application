package com.arun.dao;

import com.arun.entity.ProductDetails;

public class ShoppingDao {
	
	ProductDetails pd = new ProductDetails();
	public void logic(int id,String name) {
		
		pd.setProductId(id);
		pd.setProductName(name);
	}
	
	public void view() {
		System.out.println(pd.getProductId());
		System.out.println(pd.getProductName());
		
	}

}
