package com.riwi.controllers;

import com.riwi.entities.EntityVuelo;
import com.riwi.models.ModelVuelo;

import java.sql.Time;
import java.sql.Date;

public class ControllerVuelo {

    ModelVuelo modelVuelo;

    public ControllerVuelo(){
        this.modelVuelo = new ModelVuelo();
    }

    public EntityVuelo create(String destino, Date fecha_salida, Time hora_salida, Integer id_avion){
        EntityVuelo entityVuelo = new EntityVuelo(destino,fecha_salida,hora_salida,id_avion);
        return this.modelVuelo.create(entityVuelo);
    }

    public Object read(int id){
        return this.modelVuelo.read(id);
    }

    public Boolean delete(int id){
        return this.modelVuelo.delete(id);
    }

    public EntityVuelo update(EntityVuelo entityVuelo, int id){
        return this.modelVuelo.update(entityVuelo, id);
    }
}
