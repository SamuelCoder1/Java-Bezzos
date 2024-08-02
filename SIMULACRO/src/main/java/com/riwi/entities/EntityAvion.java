package com.riwi.entities;

public class EntityAvion {
    private int id_avion;
    private String modelo;
    private int capacidad;

    public EntityAvion() {
    }

    public EntityAvion(int capacidad, String modelo) {
        this.capacidad = capacidad;
        this.modelo = modelo;
    }

    public EntityAvion(int id_avion, String modelo, int capacidad) {
        this.id_avion = id_avion;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public int getId_avion() {
        return id_avion;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setId_avion(int id_avion) {
        this.id_avion = id_avion;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "EntityAvion" + "\n"+
                "Id_Avion: " + this.id_avion + "\n" +
                "Modelo= " + this.modelo + "\n" +
                "Capacidad= " + this.capacidad
                ;
    }
}
