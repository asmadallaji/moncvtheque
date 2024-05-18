package com.cvtheque.repository;

import java.sql.Connection;
import java.util.List;

import com.cvtheque.dao.DAO;
import com.cvtheque.models.Formation;

public class FormationImpl implements DAO<Formation> {

	
	Connection cn;
	
	public FormationImpl(Connection cn) {
		this.cn = cn;
	}

	@Override
	public List<Formation> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Formation obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Formation obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Formation obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Formation findById(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Formation findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
