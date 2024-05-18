package com.cvtheque.dao;

import java.util.List;

public interface DAO<T> {
	
	public List<T> getAll();
	public int insert(T obj);
	public int delete(T obj);
	public int update(T obj);
	public T findById(int num);
	public T findByName(String name);

}
