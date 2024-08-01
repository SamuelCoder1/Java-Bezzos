package com.riwi.entities;

import java.time.LocalDate;

public class EntityReservacion {

    private int id_reservacion;
    private LocalDate fecha_reservacion;
    private String asiento;
    private int id_pasajero;
    private int id_vuelo;

    public EntityReservacion() {
    }

    public EntityReservacion(int id_reservacion, LocalDate fecha_reservacion, String asiento, int id_pasajero, int id_vuelo) {
        this.id_reservacion = id_reservacion;
        this.fecha_reservacion = fecha_reservacion;
        this.asiento = asiento;
        this.id_pasajero = id_pasajero;
        this.id_vuelo = id_vuelo;
    }

    public int getId_reservacion() {
        return id_reservacion;
    }

    public LocalDate getFecha_reservacion() {
        return fecha_reservacion;
    }

    public String getAsiento() {
        return asiento;
    }

    public int getId_pasajero() {
        return id_pasajero;
    }

    public int getId_vuelo() {
        return id_vuelo;
    }

    public void setId_reservacion(int id_reservacion) {
        this.id_reservacion = id_reservacion;
    }

    public void setFecha_reservacion(LocalDate fecha_reservacion) {
        this.fecha_reservacion = fecha_reservacion;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public void setId_pasajero(int id_pasajero) {
        this.id_pasajero = id_pasajero;
    }

    public void setId_vuelo(int id_vuelo) {
        this.id_vuelo = id_vuelo;
    }

    @Override
    public String toString() {
        return "EntityReservacion" + "\n" +
                "Id_reservacion= " + this.id_reservacion + "\n" +
                "Fecha_reservacion= " + this.fecha_reservacion + "\n" +
                "Asiento= " + this.asiento + "\n" +
                "Id_pasajero= " + this.id_pasajero+ "\n" +
                "Id_vuelo= " + this.id_vuelo
                ;
    }
}
