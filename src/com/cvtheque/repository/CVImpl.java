package com.cvtheque.repository;

import java.sql.Connection;
import java.util.List;

import com.cvtheque.dao.DAO;
import com.cvtheque.models.CV;

public class CVImpl implements DAO<CV> {
	
	Connection cn;

	public CVImpl(Connection cn) {
		this.cn = cn;
	}

	@Override
	public List<CV> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(CV obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(CV obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(CV obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CV findById(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CV findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
