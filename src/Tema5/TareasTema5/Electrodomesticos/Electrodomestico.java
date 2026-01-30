package Tema5.TareasTema5.Electrodomesticos;
public class Electrodomestico {

    protected String marca;
    protected String modelo;
    protected ConsumoEnergetico consumoEnergetico;
    protected Float precioBase;
    protected Float peso;
    protected String color;

    public Electrodomestico(String marca, String modelo, Float precioBase, Float peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = "Blanco";
        this.consumoEnergetico = ConsumoEnergetico.F;
    }

    public Electrodomestico(String marca, String modelo, ConsumoEnergetico consumoEnergetico, Float precioBase, Float peso, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumoEnergetico = consumoEnergetico;
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public ConsumoEnergetico getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(ConsumoEnergetico consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Float precioBase) {
        this.precioBase = precioBase;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Electrodomestico{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", consumoEnergetico=").append(consumoEnergetico);
        sb.append(", precioBase=").append(precioBase);
        sb.append(", peso=").append(peso);
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }

    //------------------------------------------------------

    /**
     * Calcula el precio final del electrodoméstico sumando al precio base un extra
     * Hay un extra por consumo energético y otro por peso
     * @return
     */
    public Double calcularPrecioFinal(){
        double extra = 0;

        switch (consumoEnergetico) {
            case A -> extra = 100.0;
            case B -> extra = 80.0;
            case C -> extra = 60.0;
            case D -> extra = 50.0;
            case E -> extra = 30.0;
            case F -> extra = 100.0;
        }

        if (this.peso > 0 && this.peso <= 19) {
            extra += 10;
        } else if (this.peso > 19 && this.peso <= 49) {
            extra += 50;
        } else if (this.peso > 49 && this.peso <= 79) {
            extra += 80;
        } else if (this.peso > 79) {
            extra += 100;
        }

        return this.precioBase + extra;
    }



}
