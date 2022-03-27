package com.example.demo.controller;

import com.example.demo.model.Entity;
import com.example.demo.service.EntityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class EntityController {
    public final EntityService entityService;

    public EntityController(EntityService entityService) {
        this.entityService = entityService;
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Entity>> getAll(){
        return ResponseEntity.ok(entityService.getEntityList());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Entity> get(Long id){
        return ResponseEntity.ok(entityService.getEntity(id));
    }

    @PostMapping("/create/{name}")
    public ResponseEntity<List<Entity>> createEntity(String name){
        Entity entity = new Entity();
        entity.setName(name);
        entityService.saveEntity(entity);
        return ResponseEntity.ok(entityService.getEntityList());
    }

    @PostMapping("/delete/{id}")
    public ResponseEntity<List<Entity>> delete(Long id){
        entityService.deleteEntity(id);
        return ResponseEntity.ok(entityService.getEntityList());
    }
}
