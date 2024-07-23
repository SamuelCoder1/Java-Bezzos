package Inventarios;

import java.util.ArrayList;

public class Inventario {
    ArrayList<ProductoEspecifico> inventario = new ArrayList<>();
    public void añadir(ProductoEspecifico producto){
        inventario.add(producto);
    }

    public void eliminar(int id){
        for (ProductoEspecifico producto:inventario){
            if (producto.getId() == id){
                inventario.remove(producto);
            }
        }
    }

    public void listar(){
        for (ProductoEspecifico producto:inventario){
            System.out.println(producto);
        }
    }

}
