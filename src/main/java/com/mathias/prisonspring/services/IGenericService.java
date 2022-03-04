package com.mathias.prisonspring.services;

import java.util.List;

public interface IGenericService<T> {

    public List<T> findAll();

    /**
     *
     * @param id
     * @return
     */
    public T findById(Long id);

    /**
     *
     * @param Entity
     * @return
     */
    public T save(T Entity);

    /**
     *
     * @param Entity
     * @return
     */
    public T update(T Entity);

    /**
     *
     * @param id
     */
    public void delete(Long id);

}
