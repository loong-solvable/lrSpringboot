package com.powernode.springboot.service;

public interface UserService {

    void save(Long id, String name);
    void deleteById(Long id);
}
