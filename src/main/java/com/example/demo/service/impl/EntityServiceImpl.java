package com.example.demo.service.impl;

import com.example.demo.model.Entity;
import com.example.demo.repository.EntityRepository;
import com.example.demo.service.EntityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntityServiceImpl implements EntityService {
    private final EntityRepository repository;

    public EntityServiceImpl(EntityRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Entity> getEntityList() {
        return repository.findAll();
    }

    @Override
    public void saveEntity(Entity entity) {
        repository.save(entity);
    }

    @Override
    public Entity getEntity(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void deleteEntity(Long id) {
        repository.delete(getEntity(id));
    }
}
