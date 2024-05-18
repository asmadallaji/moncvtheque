package com.cvtheque.repository;

import java.sql.Connection;
import java.util.List;

import com.cvtheque.dao.DAO;
import com.cvtheque.models.Candidat;

public class CandidatImpl implements DAO<Candidat> {
	
	Connection cn;

	public CandidatImpl(Connection c) {
		cn = c;
	}

	@Override
	public List<Candidat> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Candidat obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Candidat obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Candidat obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Candidat findById(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Candidat findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
