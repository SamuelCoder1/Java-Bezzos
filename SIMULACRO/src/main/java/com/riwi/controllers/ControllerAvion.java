package com.riwi.controllers;

import com.riwi.entities.EntityAvion;
import com.riwi.models.ModelAvion;

public class ControllerAvion {

    ModelAvion modelAvion;

    public ControllerAvion(){
        this.modelAvion = new ModelAvion();
    }

    public EntityAvion create(String modelo, Integer capacidad){
        return this.modelAvion.create(new EntityAvion(capacidad,modelo));
    }

    public Object read(int id){
        return this.modelAvion.read(id);
    }

    public Boolean delete(int id){
        return this.modelAvion.delete(id);
    }

    public EntityAvion update(EntityAvion entityAvion, int id){
        return this.modelAvion.update(entityAvion, id);
    }
}
