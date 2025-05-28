package com.example.springcustomermanagement.serivce;

import java.util.List;

public interface ICustomerService <E> {
    List<E> findAll();
    E findById(int id);
    E save(E entity);
}
