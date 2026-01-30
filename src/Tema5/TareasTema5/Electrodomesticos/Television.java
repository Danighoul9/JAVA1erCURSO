package Tema5.TareasTema5.Electrodomesticos;
public class Television extends Electrodomestico {

    private ResolucionTV resolucionTV;
    private TecnologiaTV tecnologiaTV;
    private Integer pulgadas; //22,24,28,32,40,42,48,50,55,65,70,75

    public Television(String marca, String modelo, Float precioBase, Float peso,
                      ResolucionTV resolucionTV, TecnologiaTV tecnologiaTV,
                      Integer pulgadas) {
        super(marca, modelo, precioBase, peso);
        this.resolucionTV = resolucionTV;
        this.tecnologiaTV = tecnologiaTV;
        this.pulgadas = pulgadas;
    }

    public Television(String marca, String modelo, ConsumoEnergetico consumoEnergetico,
                      Float precioBase, Float peso, String color, ResolucionTV resolucionTV,
                      TecnologiaTV tecnologiaTV, Integer pulgadas) {
        super(marca, modelo, consumoEnergetico, precioBase, peso, color);
        this.resolucionTV = resolucionTV;
        this.tecnologiaTV = tecnologiaTV;
        this.pulgadas = pulgadas;
    }

    public ResolucionTV getResolucionTV() {
        return resolucionTV;
    }

    public void setResolucionTV(ResolucionTV resolucionTV) {
        this.resolucionTV = resolucionTV;
    }

    public TecnologiaTV getTecnologiaTV() {
        return tecnologiaTV;
    }

    public void setTecnologiaTV(TecnologiaTV tecnologiaTV) {
        this.tecnologiaTV = tecnologiaTV;
    }

    public Integer getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Integer pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Television{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", consumoEnergetico=").append(consumoEnergetico);
        sb.append(", precioBase=").append(precioBase);
        sb.append(", peso=").append(peso);
        sb.append(", color='").append(color).append('\'');
        sb.append(", resolucionTV=").append(resolucionTV);
        sb.append(", tecnologiaTV=").append(tecnologiaTV);
        sb.append(", pulgadas=").append(pulgadas);
        sb.append('}');
        return sb.toString();
    }

    //-------------------------------------------------


    @Override
    public Double calcularPrecioFinal() {
        Double precioFinal = super.calcularPrecioFinal();
        if (this.pulgadas >= 60)
            precioFinal += 100;

        if (this.getResolucionTV().equals(ResolucionTV._4K))
            precioFinal += 50;

        if (this.getResolucionTV().equals(ResolucionTV._8K))
            precioFinal+= 50;

        if (this.tecnologiaTV.equals(TecnologiaTV.OLED))
            precioFinal += 100;

        return precioFinal;
    }
}