package Tema4.TareasTema4.EJ1CuentaCorriente;

import java.util.UUID;

public class CuentaCorriente {

    private String numero;
    private Double saldo;

    private static Integer digito = 0;

    public CuentaCorriente() {
        CuentaCorriente.digito++;
        this.saldo = 0.0;
        this.numero = UUID.randomUUID().toString() + "-" + digito;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CuentaCorriente{");
        sb.append("numero='").append(numero).append('\'');
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }

    //Métodos propios
    public void ingresar(Double cantidad){
        this.saldo += cantidad;
    }

    public void retirar(Double cantidad) throws Exception {
        if (this.saldo - cantidad >= 0) {
            this.saldo -= cantidad;
        } else {
            throw new Exception("No saldo suficiente");
        }
    }

    public void transferencia(CuentaCorriente cc, Double cantidad) throws Exception {
        if (this.saldo - cantidad >= 0) {
            this.saldo -= cantidad;
            cc.ingresar(cantidad);
        } else {
            throw new Exception("No saldo suficiente");
        }
    }
}
