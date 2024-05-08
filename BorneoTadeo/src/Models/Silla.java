package Models;

import Interface.Oferta;

public class Silla extends ProductoOficina implements Oferta {
    private Boolean ruedas;

    public Boolean getRuedas() {
        return ruedas;
    }

    public void setRuedas(Boolean ruedas) {
        this.ruedas = ruedas;
    }

    public Silla() {
    }

    public Silla(Integer stock, String nombre, Double precio, Boolean ruedas) {
        super(stock, nombre, precio);
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "Silla{" + super.toString() +
                " ruedas=" + ruedas +
                '}';
    }

    @Override
    public Double descuento(Double porcentaje) {
        return this.getPrecio() * (1 - (porcentaje / 100));
    }

    @Override
    public void aumento() {
        this.setPrecio(this.getPrecio() * 1.05d);
    }
}
