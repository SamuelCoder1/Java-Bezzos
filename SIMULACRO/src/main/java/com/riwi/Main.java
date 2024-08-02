package com.riwi;

import com.riwi.controllers.ControllerReservacion;
import com.riwi.controllers.ControllerReservacion;
import com.riwi.controllers.ControllerReservacion;
import com.riwi.controllers.ControllerReservacion;
import com.riwi.entities.EntityReservacion;
import com.riwi.persistences.configDB.ConfigDB;

import javax.swing.*;
import java.sql.Time;
import java.time.LocalDate;
import java.sql.Date;

public class Main {
    public static void main(String[] args) {

        /*ControllerReservacion controllerReservacion = new ControllerReservacion();

        String opcion;

        do {
            opcion = JOptionPane.showInputDialog("" +
                    "Bienvenidos a nuestra aerolinea \n" +
                    "Opciones: \n" +
                    "1. Crear Reservacion \n" +
                    "2. Eliminar Reservacion \n" +
                    "3. Buscar Reservacion \n" +
                    "4. Actualizar Reservacion \n" +

                    "5. Salir \n"
                    );

            switch (opcion) {
                case "1" -> {
                    // Input of name
                    String modelo = JOptionPane.showInputDialog("Ingrese el modelo del Reservacion");

                    // Input of age
                    int capacidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad del Reservacion"));

                    Object resultado = controllerReservacion.create(modelo, capacidad);

                    JOptionPane.showMessageDialog(null, resultado.toString());

                    }
                case "2" -> {
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Inserte el ID del Reservacion"));
                    boolean estado = controllerReservacion.delete(id);

                    if (!estado){
                        JOptionPane.showMessageDialog(null, "Reservacion eliminado exitosamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al eliminar el Reservacion");
                    }
                }
                case "3" -> {
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Inserte el id del Reservacion"));
                    Object Reservacion = controllerReservacion.read(id);
                    JOptionPane.showMessageDialog(null, Reservacion.toString());
                }
                case "4" -> {
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Inserte el id del Reservacion a actualizar"));

                    int capacidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad del Reservacion"));

                    String modelo = JOptionPane.showInputDialog("Ingrese el modelo del Reservacion");

                    EntityReservacion Reservacion = new EntityReservacion(capacidad, modelo);



                    controllerReservacion.update(Reservacion, id);
                    JOptionPane.showMessageDialog(null, Reservacion.toString());
                }
            }
        }
        while (!opcion.equals("5"));*/

        /*ControllerReservacion controllerReservacion = new ControllerReservacion();

        String opcion;

        do {
            opcion = JOptionPane.showInputDialog("" +
                    "Bienvenidos a nuestra aerolinea \n" +
                    "Opciones: \n" +
                    "1. Crear Reservacion \n" +
                    "2. Eliminar Reservacion \n" +
                    "3. Buscar Reservacion \n" +
                    "4. Actualizar Reservacion \n" +

                    "5. Salir \n"
            );

            switch (opcion) {
                case "1" -> {

                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del Reservacion");

                    String apellido = JOptionPane.showInputDialog("Ingrese el apellido del Reservacion");

                    String documento_identidad = JOptionPane.showInputDialog("Ingrese el documento del Reservacion");

                    Object resultado = controllerReservacion.create(nombre,apellido,documento_identidad);

                    JOptionPane.showMessageDialog(null, resultado.toString());

                }
                case "2" -> {
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Inserte el ID del Reservacion"));
                    boolean estado = controllerReservacion.delete(id);

                    if (!estado){
                        JOptionPane.showMessageDialog(null, "Reservacion eliminado exitosamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al eliminar el Reservacion");
                    }
                }
                case "3" -> {
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Inserte el id del Reservacion"));
                    Object Reservacion = controllerReservacion.read(id);
                    JOptionPane.showMessageDialog(null, Reservacion.toString());
                }
                case "4" -> {

                    int id = Integer.parseInt(JOptionPane.showInputDialog("Inserte el id del Reservacion a actualizar"));

                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del Reservacion");

                    String apellido = JOptionPane.showInputDialog("Ingrese el apellido del Reservacion");

                    String documento_identidad = JOptionPane.showInputDialog("Ingrese el documento del Reservacion");



                    EntityReservacion Reservacion = new EntityReservacion(id,nombre,apellido,documento_identidad);



                    controllerReservacion.update(Reservacion, id);
                    JOptionPane.showMessageDialog(null, Reservacion.toString());
                }
            }
        }
        while (!opcion.equals("5"));
*/

        /*ControllerReservacion controllerReservacion = new ControllerReservacion();

        String opcion;

        do {
            opcion = JOptionPane.showInputDialog("" +
                    "Bienvenidos a nuestra aerolinea \n" +
                    "Opciones: \n" +
                    "1. Crear Reservacion \n" +
                    "2. Eliminar Reservacion \n" +
                    "3. Buscar Reservacion \n" +
                    "4. Actualizar Reservacion \n" +

                    "5. Salir \n"
            );

            switch (opcion) {
                case "1" -> {

                    String destino = JOptionPane.showInputDialog("Ingrese el destino del Reservacion");

                    LocalDate fecha_salida = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha de salida del Reservacion"));

                    Time hora_salida = Time.valueOf(JOptionPane.showInputDialog("Ingrese la hora de salida del Reservacion"));

                    Integer id_avion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del avion"));


                    Object resultado = controllerReservacion.create(destino,Date.valueOf(fecha_salida),hora_salida,id_avion);

                    JOptionPane.showMessageDialog(null, resultado.toString());

                }
                case "2" -> {
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Inserte el ID del Reservacion"));
                    boolean estado = controllerReservacion.delete(id);

                    if (!estado){
                        JOptionPane.showMessageDialog(null, "Reservacion eliminado exitosamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al eliminar el Reservacion");
                    }
                }
                case "3" -> {
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Inserte el id del Reservacion"));
                    Object Reservacion = controllerReservacion.read(id);
                    JOptionPane.showMessageDialog(null, Reservacion.toString());
                }
                case "4" -> {

                    int id = Integer.parseInt(JOptionPane.showInputDialog("Inserte el id del Reservacion a actualizar"));

                    String destino = JOptionPane.showInputDialog("Ingrese el nombre del Reservacion");

                    LocalDate fecha_salida = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha de salida del Reservacion"));

                    Time hora_salida = Time.valueOf(JOptionPane.showInputDialog("Ingrese la hora de salida del Reservacion"));

                    Integer id_avion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del avion"));



                    EntityReservacion Reservacion = new EntityReservacion(destino,Date.valueOf(fecha_salida),hora_salida,id_avion);



                    controllerReservacion.update(Reservacion, id);
                    JOptionPane.showMessageDialog(null, Reservacion.toString());
                }
            }
        }
        while (!opcion.equals("5"));*/

        ControllerReservacion controllerReservacion = new ControllerReservacion();

        String opcion;

        do {
            opcion = JOptionPane.showInputDialog("" +
                    "Bienvenidos a nuestra aerolinea \n" +
                    "Opciones: \n" +
                    "1. Crear Reservacion \n" +
                    "2. Eliminar Reservacion \n" +
                    "3. Buscar Reservacion \n" +
                    "4. Actualizar Reservacion \n" +

                    "5. Salir \n"
            );

            switch (opcion) {
                case "1" -> {

                    LocalDate fecha_reservacion = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha de la reservacion"));

                    String asiento = JOptionPane.showInputDialog("Ingrese su asiento");

                    Integer id_pasajero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del pasajero"));

                    Integer id_vuelo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del vuelo"));


                    Object resultado = controllerReservacion.create(Date.valueOf(fecha_reservacion),asiento,id_pasajero,id_vuelo);

                    JOptionPane.showMessageDialog(null, resultado.toString());

                }
                case "2" -> {
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Inserte el ID de la reservacion"));
                    boolean estado = controllerReservacion.delete(id);

                    if (!estado){
                        JOptionPane.showMessageDialog(null, "Reservacion eliminada exitosamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al eliminar la reservacion");
                    }
                }
                case "3" -> {
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Inserte el id de la reservacion"));
                    Object reservacion = controllerReservacion.read(id);
                    JOptionPane.showMessageDialog(null, reservacion.toString());
                }
                case "4" -> {

                    int id = Integer.parseInt(JOptionPane.showInputDialog("Inserte el id de la reservacion a actualizar"));

                    LocalDate fecha_reservacion = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha de la reservacion"));

                    String asiento = JOptionPane.showInputDialog("Ingrese el asiento de la reservacion");

                    Integer id_pasajero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del pasajero"));

                    Integer id_vuelo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del vuelo"));



                    EntityReservacion reservacion = new EntityReservacion(Date.valueOf(fecha_reservacion),asiento,id_pasajero,id_vuelo);



                    controllerReservacion.update(reservacion, id);
                    JOptionPane.showMessageDialog(null, reservacion.toString());
                }
            }
        }
        while (!opcion.equals("5"));

    }
}