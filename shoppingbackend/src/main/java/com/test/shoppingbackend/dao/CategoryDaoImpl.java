package com.test.shoppingbackend.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.shoppingbackend.dto.Category;

@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {

	private static List<Category> categories = new ArrayList<>();

	
	static {
		
			//firstcategory
		Category category = new Category();
		
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is For description television");
		category.setImageUrl("Cat_1.png");
	
		
		categories.add(category);
		
//			SecondCategory
		
		category = new Category();
		category.setId(2);
		category.setName("sdsdbile");
		category.setDescription("This is For description mobile");
		category.setImageUrl("Cat_1.png");
	
		
		categories.add(category);
		
//			3rd Category
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is For description laptop");
		category.setImageUrl("Cat_1.png");
	
		
		categories.add(category);
		
	}
	
	@Override
	public List<Category> list() {

		
		
		
		
		
		return categories;
	}

}
