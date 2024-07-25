package Inventarios;

import java.util.ArrayList;

public class Inventario {
    ArrayList<ProductoEspecifico> inventario = new ArrayList<>();
    private int newId = 1;

    private int getNewId() {
        return newId++;
    }

    public void añadir(String nombre, Double precio, String categoria, String marca){
        int id = getNewId();
        ProductoEspecifico producto = new ProductoEspecifico(id, nombre, precio, categoria, marca);
        inventario.add(producto);
    }

    public void eliminar(int id){
        boolean eliminado = false;
        for (int i = 0; i < inventario.size(); i++) {
            if (inventario.get(i).getId() == id) {
                inventario.remove(i);
                eliminado = true;
                System.out.println("El producto con id " + id + " fue eliminado.");
                break;
            }
        }
        if (!eliminado) {
                System.out.println("No se encontró el producto con id " + id);
        }
    }

    public void listar(){
        for (ProductoEspecifico producto:inventario){
            System.out.println(producto);
        }
    }

    public void buscar(String nombre){
        boolean encontrado = false;
        for (ProductoEspecifico producto : inventario) {
            if (producto.getNombre().equals(nombre)) {
                System.out.println("El producto " + producto.getNombre() + " se encuentra en el inventario.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Producto no encontrado");
        }
    }
}
