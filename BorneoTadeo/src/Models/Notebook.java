package Models;

public class Notebook extends ProductoInformatico {
    private Integer memoria;

    public Integer getMemoria() {
        return memoria;
    }

    public void setMemoria(Integer memoria) {
        this.memoria = memoria;
    }

    public Notebook() {
    }

    public Notebook(Integer stock, String nombre, Double precio, String fabricante, Integer memoria) {
        super(stock, nombre, precio, fabricante);
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Notebook{" + super.toString() +
                " memoria=" + memoria +
                '}';
    }

    @Override
    public void aumento() {
        this.setPrecio(this.getPrecio() * 1.20d);
    }
}
