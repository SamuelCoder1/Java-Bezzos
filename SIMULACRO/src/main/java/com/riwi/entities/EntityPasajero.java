package com.riwi.entities;

public class EntityPasajero {
    private int id_pasajero;
    private String nombre;
    private String apellido;
    private String documento_identidad;

    public EntityPasajero() {
    }

    public EntityPasajero(int id_pasajero, String nombre, String apellido, String documento_identidad) {
        this.id_pasajero = id_pasajero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento_identidad = documento_identidad;
    }

    public int getId_pasajero() {
        return id_pasajero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDocumento_identidad() {
        return documento_identidad;
    }

    public void setId_pasajero(int id_pasajero) {
        this.id_pasajero = id_pasajero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDocumento_identidad(String documento_identidad) {
        this.documento_identidad = documento_identidad;
    }

    @Override
    public String toString() {
        return "EntityPasajero: " + "\n" +
                "Id Pasajero= " + this.id_pasajero + "\n"+
                "Nombre= " + this.nombre + "\n" +
                "Apellido= " + this.apellido + "\n" +
                "Documento_identidad= " + this.documento_identidad
                ;
    }
}
