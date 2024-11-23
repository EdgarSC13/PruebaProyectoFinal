package DAO;

import BEAN.Producto;
import java.util.Vector;

public class ProductoDAO {
    private Vector vecProd;

    public ProductoDAO() {
        vecProd = new Vector();
    }

    public void agregaProducto(Producto p) {
        vecProd.addElement(p);
    }

    public void reportaProductos(){
        for(int i = 0; i < vecProd.size(); i++){
            Producto prod;
            prod = (Producto) vecProd.get(i);
            System.out.println(prod.reportaDatos());
            System.out.println("===================");
        }
    }
}
