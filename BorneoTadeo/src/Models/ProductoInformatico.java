package Models;

public abstract class ProductoInformatico extends ProductoOficina {
    private String fabricante;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public ProductoInformatico() {
    }

    public ProductoInformatico(Integer stock, String nombre, Double precio, String fabricante) {
        super(stock, nombre, precio);
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return super.toString() + " fabricante='" + fabricante + '\'';
    }
}
