package PREUBA;

import BEAN.Producto;
import DAO.ProductoDAO;

public class Test {
    public static void main(String[] args) {
        ProductoDAO prodDao = new ProductoDAO();

        Producto prod1 = new Producto(101,"Laptop HP","Computo",1500.5,"Activo");
        Producto prod2 = new Producto(102,"Impresora Epson","Computo",350.5,"Activo");
        Producto prod3 = new Producto(103,"Cuaderno rayado","Libreria",5.5,"Activo");
        Producto prod4 = new Producto(104,"Taladro","Maquinaria",650.70,"Activo");
        Producto prod5 = new Producto(105,"Mouse","Computo",58.0,"Activo");

        prodDao.agregaProducto(prod1);
        prodDao.agregaProducto(prod2);
        prodDao.agregaProducto(prod3);
        prodDao.agregaProducto(prod4);
        prodDao.agregaProducto(prod5);

        prodDao.reportaProductos();

    }
}
