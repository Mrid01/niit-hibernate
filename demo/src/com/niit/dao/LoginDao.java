package com.niit.dao;

import com.niit.models.Student;

public interface LoginDao {
	Student validUser(String uName, String pwd);

}
