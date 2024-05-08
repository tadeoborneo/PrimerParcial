package Models;

import Interface.Oferta;

public class Impresora extends ProductoInformatico implements Oferta {
    private Integer impresionesPorMinuto;

    public Integer getImpresionesPorMinuto() {
        return impresionesPorMinuto;
    }

    public void setImpresionesPorMinuto(Integer impresionesPorMinuto) {
        this.impresionesPorMinuto = impresionesPorMinuto;
    }

    public Impresora() {
    }

    public Impresora(Integer stock, String nombre, Double precio, String fabricante, Integer impresionesPorMinuto) {
        super(stock, nombre, precio, fabricante);
        this.impresionesPorMinuto = impresionesPorMinuto;
    }

    @Override
    public String toString() {
        return  "Impresora{" + super.toString() +
                " impresionesPorMinuto=" + impresionesPorMinuto ;
    }

    @Override
    public void aumento() {
        this.setPrecio(this.getPrecio() * 1.15d);
    }

    @Override
    public Double descuento(Double porcentaje) {
        return this.getPrecio() * (1 - (porcentaje / 100));
    }
}
