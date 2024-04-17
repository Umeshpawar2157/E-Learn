package com.Elearning.dao;

import java.util.List;

import com.Elearning.entity.OrderDetail;
import com.Elearning.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailDao extends JpaRepository<OrderDetail, Integer>
{

	public List<OrderDetail> findByUser(User user);
	
	public List<OrderDetail> findByOrderStatus(String status);
}
