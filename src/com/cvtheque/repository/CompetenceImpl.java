package com.cvtheque.repository;

import java.sql.Connection;
import java.util.List;

import com.cvtheque.dao.DAO;
import com.cvtheque.models.Competence;

public class CompetenceImpl implements DAO<Competence>{

	Connection cn;
	
	public CompetenceImpl(Connection cn) {
		this.cn = cn;
	}

	@Override
	public List<Competence> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Competence obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Competence obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Competence obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Competence findById(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Competence findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
