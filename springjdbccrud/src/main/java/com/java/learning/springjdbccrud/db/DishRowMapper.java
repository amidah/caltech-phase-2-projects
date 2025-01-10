package com.java.learning.springjdbccrud.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.java.learning.springjdbccrud.model.Dish;

public class DishRowMapper implements RowMapper<Dish>{

	public Dish mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Dish dish = new Dish();
		dish.setDishId(rs.getInt("dishId"));
		dish.setName(rs.getString("name"));
		dish.setPrice(rs.getInt("price"));
		
		return dish;
	}

}
