package Models;

public class Escritorio extends ProductoOficina {
    private Double alto;
    private Double ancho;

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Escritorio() {
    }

    public Escritorio(Integer stock, String nombre, Double precio, Double alto, Double ancho) {
        super(stock, nombre, precio);
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Escritorio{" + super.toString() +
                " alto=" + alto +
                "cm, ancho=" + ancho + "cm}";
    }

    @Override
    public void aumento() {
        this.setPrecio(this.getPrecio() * 1.1d);
    }
}
