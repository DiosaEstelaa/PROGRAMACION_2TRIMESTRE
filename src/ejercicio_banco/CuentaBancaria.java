
package ejercicio_banco;

public class CuentaBancaria {
    
    private String iban, titular;
    private double saldo;
    private int movimientos;
   
    public CuentaBancaria(){

}

    public CuentaBancaria(String iban, String titular, double saldo, int movimientos) {
        this.iban = iban;
        this.titular = titular;
        this.saldo = saldo;
        this.movimientos = movimientos;
    }

    public String getIban() {
        return iban;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getMovimientos() {
        return movimientos;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setMovimientos(int movimientos) {
        this.movimientos = movimientos;
    }
    
} // public class CuentaBancaria





