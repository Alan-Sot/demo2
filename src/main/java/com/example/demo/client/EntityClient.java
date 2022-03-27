package com.example.demo.client;

import com.example.demo.model.Entity;

import java.util.List;

public interface EntityClient {
    String GET_ALL = "/demo//get-all";
    String GET = "/demo//get";
    String CREATE = "/demo//create";
    String DELETE = "/demo//delete";

    List<Entity> getAll();
    void create(Entity entity);
    Entity read(Long id);
    void delete(Long id);
}
