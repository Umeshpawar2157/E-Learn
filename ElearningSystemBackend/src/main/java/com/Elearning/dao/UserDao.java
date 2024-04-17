package com.Elearning.dao;



import com.Elearning.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, String> 
{
	
	public User findByUserName(String userName);
}