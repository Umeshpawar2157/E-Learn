package com.Elearning.dao;

import java.util.List;

import com.Elearning.entity.Cart;
import com.Elearning.entity.User;

import org.springframework.data.repository.CrudRepository;

public interface CartDao extends CrudRepository<Cart, Integer>
{
	public List<Cart> findByUser(User user);

}
