package Tema5.MetodoStatic;

import java.util.Objects;

public class CuentaBancaria {

    //Propiedades static
    private static Integer totalCuentas = 0;
    private static Double tasaInteres = 0.02; //Aplicar a todas las cuentas
    private static final String nombreBanco = "BCA";

    //Propiedades no static
    private String idCuenta;
    private Double saldo;
    private String titular;

    //Constructores
    public CuentaBancaria(Double saldo, String titular) {
        CuentaBancaria.totalCuentas++; //Al crear objeto nuevo se incrementa
        this.idCuenta = CuentaBancaria.generarNumeroCuenta();
        this.saldo = saldo;
        this.titular = titular;
    }

    public CuentaBancaria(String titular) {
        CuentaBancaria.totalCuentas++;
        this.idCuenta = CuentaBancaria.generarNumeroCuenta();
        this.titular = titular;
        this.saldo = 0.0;
    }

    public CuentaBancaria(CuentaBancaria otra) {
        CuentaBancaria.totalCuentas++;
        this.idCuenta = CuentaBancaria.generarNumeroCuenta(); //BCA-00000<num>
        this.saldo = otra.saldo;
        this.titular = otra.titular;
    }

    //Getters y Setters
    public String getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(String idCuenta) {
        this.idCuenta = idCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CuentaBancaria{");
        sb.append("idCuenta='").append(idCuenta).append('\'');
        sb.append(", saldo=").append(saldo);
        sb.append(", titular='").append(titular).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CuentaBancaria that = (CuentaBancaria) o;
        return Objects.equals(idCuenta, that.idCuenta);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idCuenta);
    }

    //MÉTODOS STATIC
    /**
     * Metodo privado para generar el número de cuenta en los constructores
     * @return
     */
    private static String generarNumeroCuenta(){
        return CuentaBancaria.nombreBanco + "-"
                + String.format("%06d", CuentaBancaria.totalCuentas);
    }

    public static Integer getTotalCuentas() {
        return CuentaBancaria.totalCuentas;
    }

    public static Double getTasaInteres() {
        return CuentaBancaria.tasaInteres;
    }

    public static void setTasaInteres(Double tasaInteres) {
        CuentaBancaria.tasaInteres = tasaInteres;
    }

    //MÉTODOS NO STATIC
    /**
     * Incrementa el saldo de la cuenta, si la cantidad es positiva
     * @param cantidad
     * @return true si la cantidad es positiva, false en caso contrario
     */
    public boolean depositar(Double cantidad){
        if (cantidad > 0) {
            this.saldo += cantidad;
            return true;
        }

        return false;
    }

    /**
     * Decrementa el saldo en la cantidad indicada, si la cantidad es positiva y hay saldo suficiente
     * @param cantidad
     * @return true si se puede retirar, false en caso contrario
     */
    public boolean retirar(Double cantidad){
        if (cantidad <= this.saldo && cantidad > 0) {
            this.saldo -= cantidad;
            return true;
        }

        return false;
    }

    /**
     * Calcula el beneficio de la cuenta en función del saldo y el tipo de interés remunerado
     * que el banco ofrece a TODAS las cuentas
     * @return
     */
    public Double calcularBeneficio() {
        return this.saldo * CuentaBancaria.tasaInteres;
    }



}
