package com.example.demo.client.impl;

import com.example.demo.client.EntityClient;
import com.example.demo.model.Entity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class EntityClientImpl implements EntityClient {
    public final RestTemplate client;

    public EntityClientImpl() {
        this.client = new RestTemplate();
    }

    @Override
    public List<Entity> getAll() {
        return null;
    }

    @Override
    public void create(Entity entity) {
    }

    @Override
    public Entity read(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
