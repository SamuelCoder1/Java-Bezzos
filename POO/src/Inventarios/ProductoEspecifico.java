package Inventarios;

public class ProductoEspecifico extends Producto{
    private String categoria;
    private String marca;
    public ProductoEspecifico(){}

    public ProductoEspecifico(Integer id, String nombre, Double precio, String categoria, String marca) {
        super(id, nombre, precio);
        this.categoria = categoria;
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }
    public String getMarca() {
        return marca;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return
                "Id= " + getId() + "\n" +
                "Nombre= " + getNombre() + "\n" +
                "Precio= " + getPrecio() + "\n" +
                "Categoria= " + categoria + "\n" +
                "Marca= " + marca + "\n";
    }
}