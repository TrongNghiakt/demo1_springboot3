package vn.iotstar.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import vn.iotstar.entity.Category;

public interface CategoryService {

	void deleteById(Long id);

	long count();

	Optional<Category> findById(Long id);

	List<Category> findAll();

	Page<Category> findAll(Pageable pageable);

	List<Category> findAll(Sort sort);

	Page<Category> findByNameContaining(String keyword, Pageable pageable);

	Optional<Category> findByName(String name);

	<S extends Category> S save(S entity);

	void deleteAll();

	void delete(Category entity);

	List<Category> findAllById(Iterable<Long> ids);

	<S extends Category> Optional<S> findOne(Example<S> example);

}
