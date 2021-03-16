package com.example.demo.uss.service;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Optional;

import com.example.demo.uss.domain.User;

import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

public interface UserService {

    public Optional<User> findOne(User t);
    // <S extends T> Optional<S> findOne(Example<S> example)

    public long count();
    // long count()

    public void delete(User entity);

    public void deleteAll(Iterable<User> entities);
    // void deleteAll(Iterable<? extends T> entities)

    public void deleteAll();
    // void deleteAll()

    public void deleteById(long id);
    // void deleteById(ID id)

    public <User> boolean exists(User t);
    // <S extends T> boolean exists(Example<S> example)

    public boolean existsById(long id);
    // boolean existsById(ID id)

    public Optional<User> findById(long id);
    // Optional<T> findById(ID id)

    public List<User> findAllById(Iterable<Long> ids);
    // List<T> findAllById(Iterable<ID> ids)

    public <User> User save(User entity);
    // <S extends T> S save(S entity)

    public <User> List<User> saveAll(Iterable<User> entities);

    public List<User> findAll();
    // List<T> findAll()

    public void flush();

    public <User> User saveAndFlush(User entity);
    // <S extends T> S saveAndFlush(S entity)

    public User getOne(long id);
    // T getOne(ID id)

}
