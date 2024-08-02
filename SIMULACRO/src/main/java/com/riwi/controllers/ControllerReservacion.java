package com.riwi.controllers;

import com.riwi.entities.EntityReservacion;
import com.riwi.models.ModelReservacion;

import java.sql.Time;
import java.sql.Date;

public class ControllerReservacion {

    ModelReservacion modelReservacion;

    public ControllerReservacion(){
        this.modelReservacion = new ModelReservacion();
    }

    public EntityReservacion create(Date fecha_reservacion, String asiento, Integer id_pasajero, Integer id_vuelo){
        EntityReservacion entityReservacion = new EntityReservacion(fecha_reservacion,asiento,id_pasajero,id_vuelo);
        return this.modelReservacion.create(entityReservacion);
    }

    public Object read(int id){
        return this.modelReservacion.read(id);
    }

    public Boolean delete(int id){
        return this.modelReservacion.delete(id);
    }

    public EntityReservacion update(EntityReservacion entityReservacion, int id){
        return this.modelReservacion.update(entityReservacion, id);
    }
}

