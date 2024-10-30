package vn.iotstar.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import vn.iotstar.entity.Category;
import vn.iotstar.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	CategoryRepository categoryReponsitory;

	public CategoryServiceImpl(CategoryRepository categoryReponsitory) {
		this.categoryReponsitory = categoryReponsitory;
	}

	@Override
	public Optional<Category> findByName(String name) {
		return categoryReponsitory.findByName(name);
	}

	@Override
	public Page<Category> findByNameContaining(String keyword, Pageable pageable) {
		return categoryReponsitory.findByNameContaining(keyword, pageable);
	}

	@Override
	public List<Category> findAll(Sort sort) {
		return categoryReponsitory.findAll(sort);
	}

	@Override
	public Page<Category> findAll(Pageable pageable) {
		return categoryReponsitory.findAll(pageable);
	}

	@Override
	public List<Category> findAll() {
		return categoryReponsitory.findAll();
	}

	@Override
	public Optional<Category> findById(Long id) {
		return categoryReponsitory.findById(id);
	}

	@Override
	public long count() {
		return categoryReponsitory.count();
	}

	@Override
	public void deleteById(Long id) {
		categoryReponsitory.deleteById(id);
	}

	@Override
	public <S extends Category> Optional<S> findOne(Example<S> example) {
		return categoryReponsitory.findOne(example);
	}

	@Override
	public List<Category> findAllById(Iterable<Long> ids) {
		return categoryReponsitory.findAllById(ids);
	}

	@Override
	public void delete(Category entity) {
		categoryReponsitory.delete(entity);
	}

	@Override
	public void deleteAll() {
		categoryReponsitory.deleteAll();
	}

	@Override
	public <S extends Category> S save(S entity) {
		return categoryReponsitory.save(entity);
	}

}
