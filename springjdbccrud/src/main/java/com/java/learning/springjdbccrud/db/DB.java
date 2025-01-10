package com.java.learning.springjdbccrud.db;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.java.learning.springjdbccrud.model.Dish;

public class DB {

	DataSource dataSource;
	JdbcTemplate jdbcTemplate;

	public DB() {

	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);
		System.out.println("[DB] Setter Injection on Datasource and JdbcTemplate initialized");
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insertDish(Dish dish) {

		String sql = "insert into Dish values(null, ?, ?)";

		int result = jdbcTemplate.update(sql, dish.getName(), dish.getPrice());
		System.out.println("Dish " + dish.getName() + " Inserted in table");

	}

	public void getDishes() {

		String sql = "select * from Dish";

		// we can use JdbcTemplate queryForObject for single row or value
		// we can use JdbcTemplate query for multiple rows or list
	
		List<Dish> dishes = jdbcTemplate.query(sql, new DishRowMapper());
				
		System.out.println(dishes);
	}
	
	public void getDishById(int id) {

		String sql = "select * from Dish where dishId = ?";

		// we can use JdbcTemplate queryForObject for single row or value
		// we can use JdbcTemplate query for multiple rows or list
	
		Dish dish = jdbcTemplate.queryForObject(sql, new Object[]{id} , new DishRowMapper());
				
		System.out.println(dish);
	}
}
