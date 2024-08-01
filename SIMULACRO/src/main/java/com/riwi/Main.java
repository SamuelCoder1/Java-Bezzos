package com.riwi;

import com.riwi.controllers.ControllerAvion;
import com.riwi.persistences.configDB.ConfigDB;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        ControllerAvion controllerAvion = new ControllerAvion();

        String opcion;

        do {
            opcion = JOptionPane.showInputDialog("" +
                    "Bienvenidos a nuestra aerolinea \n" +
                    "Opciones: \n" +
                    "1. Crear Avion \n" +
                    "2. Eliminar Avion \n" +
                    "3. Buscar Avion \n" +
                    "4. Salir \n"
                    );

            switch (opcion) {
                case "1" -> {
                    // Input of name
                    String modelo = JOptionPane.showInputDialog("Ingrese el modelo del avion");

                    // Input of age
                    int capacidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad del avion"));

                    Object resultado = controllerAvion.create(modelo, capacidad);

                    JOptionPane.showMessageDialog(null, resultado.toString());

                    }
                }
            }
        while (!opcion.equals("4"));

    }
}