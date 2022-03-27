package com.example.demo.service;

import com.example.demo.model.Entity;

import java.util.List;

public interface EntityService {
    List<Entity> getEntityList();
    void saveEntity(Entity entity);
    Entity getEntity(Long id);
    void deleteEntity(Long id);
}
