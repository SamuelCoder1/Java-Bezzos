package com.riwi.controllers;

import com.riwi.entities.EntityAvion;
import com.riwi.entities.EntityPasajero;
import com.riwi.models.ModelAvion;
import com.riwi.models.ModelPasajero;

public class ControllerPasajero {

    ModelPasajero modelPasajero;

    public ControllerPasajero(){
        this.modelPasajero = new ModelPasajero();
    }

    public EntityPasajero create(String nombre, String apellido, String documento_identidad){
        return this.modelPasajero.create(new EntityPasajero(nombre,apellido,documento_identidad));
    }

    public Object read(int id){
        return this.modelPasajero.read(id);
    }

    public Boolean delete(int id){
        return this.modelPasajero.delete(id);
    }

    public EntityPasajero update(EntityPasajero entityPasajero, int id){
        return this.modelPasajero.update(entityPasajero, id);
    }
}
