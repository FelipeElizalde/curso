package ej2Cuenta;

public class Cuenta {
    private String nombreCliente;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;
    public Cuenta(){

    }
    public Cuenta (String nombreCliente, String numeroCuenta, double tipoInteres, double saldo){
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    public Cuenta(final  Cuenta c){
        nombreCliente = c.nombreCliente;
        numeroCuenta = c.numeroCuenta;
        tipoInteres = c.tipoInteres;
        saldo = c.saldo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean Ingreso(double saldo){
        boolean ingresoCorrecto = true;
        if (saldo < 0) {
            ingresoCorrecto = false;
        } else {
            saldo = saldo + saldo;
        }
        return ingresoCorrecto;
    }

    public boolean Reintegro(double saldo){
        boolean reintegroCorrecto = true;
        if (saldo < 0){
            reintegroCorrecto = false;
        } else if (this.saldo >= saldo){
            this.saldo -= saldo;
        }else{
            reintegroCorrecto = false;
        }
        return reintegroCorrecto;
    }

    public boolean Transferencia(Cuenta c, double n){
        boolean correcto = true;
        if (n < 0) {
            correcto = false;
        } else if (saldo >= n) {
            Reintegro(n);
            c.Ingreso(n);
        } else {
            correcto = false;
        }
        return correcto;
    }

}
