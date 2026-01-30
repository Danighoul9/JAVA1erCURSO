package Tema5.TareasTema5.Electrodomesticos;

public class Lavadora extends Electrodomestico {

    private Integer carga;

    public Lavadora(String marca, String modelo, Float precioBase, Float peso) {
        super(marca, modelo, precioBase, peso);
        this.carga = 5;
    }

    public Lavadora(String marca, String modelo, ConsumoEnergetico consumoEnergetico, Float precioBase,
                    Float peso, String color, Integer carga) {
        super(marca, modelo, consumoEnergetico, precioBase, peso, color);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Lavadora{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", consumoEnergetico=").append(consumoEnergetico);
        sb.append(", precioBase=").append(precioBase);
        sb.append(", peso=").append(peso);
        sb.append(", color='").append(color).append('\'');
        sb.append(", carga=").append(carga);
        sb.append('}');
        return sb.toString();
    }

    //--------------------------------


    /**
     * Incrementamos el precio en 50€ si la carga es mayor a 8kg
     * @return
     */
    @Override
    public Double calcularPrecioFinal() {
        if (this.carga > 8)
            return super.calcularPrecioFinal() + 50;
        else
            return super.calcularPrecioFinal();
    }
}