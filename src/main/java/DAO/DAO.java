package DAO;

import java.util.List;

public interface DAO<T> {

	T getById(List<T> t1, Long t2);

	void insert(List<T> t1, T t2);

	void delete(List<T> t1, T t2);
}
