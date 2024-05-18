package com.cvtheque.repository;

import java.sql.Connection;
import java.util.List;

import com.cvtheque.dao.DAO;
import com.cvtheque.models.Experience;

public class ExperienceImpl implements DAO<Experience> {
	
	Connection cn;

	public ExperienceImpl(Connection cn) {
		this.cn = cn;
	}

	@Override
	public List<Experience> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Experience obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Experience obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Experience obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Experience findById(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Experience findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
