import Inventarios.Inventario;
import Inventarios.ProductoEspecifico;

public class Main {
    public static void main(String[] args) {

        ProductoEspecifico producto = new ProductoEspecifico();

        Inventario inventario = new Inventario();

        inventario.añadir(producto);

        inventario.listar();

    }
}