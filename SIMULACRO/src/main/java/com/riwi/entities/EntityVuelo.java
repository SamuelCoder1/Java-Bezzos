package com.riwi.entities;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;

public class EntityVuelo {

    private int id_vuelo;
    private String destino;
    private Date fecha_salida;
    private Time hora_salida;
    private int id_avion;

    public EntityVuelo() {
    }

    public EntityVuelo(String destino, Date fecha_salida, Time hora_salida, int id_avion) {
        this.destino = destino;
        this.fecha_salida = fecha_salida;
        this.hora_salida = hora_salida;
        this.id_avion = id_avion;
    }

    public EntityVuelo(int id_vuelo, String destino, Date fecha_salida, Time hora_salida, int id_avion) {
        this.id_vuelo = id_vuelo;
        this.destino = destino;
        this.fecha_salida = fecha_salida;
        this.hora_salida = hora_salida;
        this.id_avion = id_avion;
    }

    public int getId_vuelo() {
        return id_vuelo;
    }

    public String getDestino() {
        return destino;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public Time getHora_salida() {
        return hora_salida;
    }

    public int getId_avion() {
        return id_avion;
    }

    public void setId_vuelo(int id_vuelo) {
        this.id_vuelo = id_vuelo;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setFecha_salida(LocalDate fecha_salida) {
        this.fecha_salida = Date.valueOf(fecha_salida);
    }

    public void setHora_salida(Time hora_salida) {
        this.hora_salida = hora_salida;
    }

    public void setId_avion(int id_avion) {
        this.id_avion = id_avion;
    }

    @Override
    public String toString() {
        return "EntityVuelo:" + "\n" +
                "Id_vuelo= " + id_vuelo + "\n" +
                "Destino= " + destino + "\n" +
                "Fecha_salida= " + fecha_salida+ "\n" +
                "Hora_salida= " + hora_salida + "\n" +
                "Id_avion= " + id_avion
                ;
    }
}
