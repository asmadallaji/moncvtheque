package com.cvtheque.dao;

import com.cvtheque.models.Candidat;
import com.cvtheque.repository.CandidatImpl;

public class factoryDao {
	
	@SuppressWarnings("unchecked")
	public static <T> DAO<T> createDAO(Class<T> clazz) {
        if (clazz == Candidat.class) {
            return (DAO<T>) new CandidatImpl(Connexion.getInstance());
        }
        return null;
    }
	
	
}
