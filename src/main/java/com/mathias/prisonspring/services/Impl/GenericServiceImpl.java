package com.mathias.prisonspring.services.Impl;

import com.mathias.prisonspring.services.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class GenericServiceImpl<T> implements IGenericService<T> {


    private JpaRepository<T, Long> repository;

    public GenericServiceImpl(JpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<T> findAll() {
        return this.repository.findAll();
    }

    @Override
    public T findById(Long id) {
        return this.repository.findById(id).get();
    }

    @Override
    public T save(T entity) {
        return this.save(entity);
    }

    @Override
    public T update(T entity) {
        return this.repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        this.repository.deleteById(id);
    }


}
