package com.cvtheque.controller;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import com.cvtheque.views.addCandidat;
import com.cvtheque.repository.CandidatImpl;
import com.cvtheque.dao.DAO;
import com.cvtheque.dao.factoryDao;
import com.cvtheque.models.Candidat;

public class candidatController implements ActionListener {
	
	addCandidat vue;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		DAO<Candidat> candidatImpl = factoryDao.createDAO(Candidat.class);
	}

	public candidatController(addCandidat vue) {
		this.vue = vue;
	}

}
