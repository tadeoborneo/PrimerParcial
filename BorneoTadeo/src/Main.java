import Models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //CREACION DE INSTANCIAS
        Impresora impresora = new Impresora(30, "Lp-200", 30000d, "Acer", 10);
        Silla silla = new Silla(10, "Niviko 300", 200000d, true);
        Escritorio escritorio = new Escritorio(15, "Mesa madera", 150000d, 70d, 100d);
        Notebook notebook = new Notebook(100, "Dell inspiron 3700", 800000d, "Dell", 24);

        //CREACION DE LISTA Y AGREGADO DE LAS INSTANCIAS
        List<ProductoOficina> productos = new ArrayList<>();
        productos.add(silla);
        productos.add(impresora);
        productos.add(notebook);
        productos.add(escritorio);

        //RECORRIDO DE LA LISTA Y MUESTRA DE LA INFORMACION DE CADA PRODUCTO
        for (ProductoOficina producto : productos) {
            System.out.println(producto);
        }

        for (ProductoOficina producto : productos) {
            //USO DEL METODO AUMENTO EN CADA INSTANCIA PARA AUMENTAR EL PRECIO SEGUN LOS PORCENTAJES DADOS
            producto.aumento();
            //MUESTRA DE CADA INSTANCIA CON LOS PRECIOS AUMENTADOS
            System.out.println("AUMENTADO: " + producto);
        }

        //USO DE LA INTERFAZ OFERTA
        System.out.println(silla.descuento(20d));
        System.out.println(impresora.descuento(50d));


    }
}