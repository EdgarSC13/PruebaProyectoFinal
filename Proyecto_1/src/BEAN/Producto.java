package BEAN;

public class Producto {
    private int idProducto;
    private String descProd;
    private String categoria;
    private double precio;
    private String estado;

    public Producto() {
    }

    public Producto(int idProducto, String descProd, String categoria, double precio, String estado) {
        this.idProducto = idProducto;
        this.descProd = descProd;
        this.categoria = categoria;
        this.precio = precio;
        this.estado = estado;
    }

    public String reportaDatos(){
        String aux;
        aux = "Id producto: " + this.idProducto;
        aux += "\nDescripcion producto:" + this.descProd;
        aux += "\nCategoria: " + this.categoria;
        aux += "\nPrecio " + this.precio;
        aux += "\nEstado " + this.estado;
        return aux;
    }
}
