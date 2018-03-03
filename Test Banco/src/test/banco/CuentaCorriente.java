
package test.banco;

/**
 *
 * @author plaga(c)
 * @date Mar 3, 2018
 * @time 9:23:20 AM
 */
public class CuentaCorriente {
    private Cliente titular;
    private int nroCuenta;
    private double saldo;
    
    public void setTitular(){
        this.titular = titular;
    }
    public void setNroCuenta(){
        this.nroCuenta = nroCuenta;
    }
    public void setSalario(){
        this.saldo = saldo;
    }
    public Cliente getTitular(){
        return titular;
    }
    public int getNroCuenta(){
        return nroCuenta;
    }
    public double getSaldo(){
        return saldo;
    }
    
    public CuentaCorriente(Cliente titular, int nroCuenta, double saldo){
        this.titular = titular;
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }
    
    public CuentaCorriente(Cliente titular, int nroCuenta){
        this.titular = titular;
        this.nroCuenta = nroCuenta;
    }
    
    public void Depositar(double monto){
        this.saldo = (saldo + monto);
    }
    
    public void Extraer(double monto){
        if (monto > saldo){
            System.out.println("Saldo insuficiente");
        }
        else
            this.saldo = (saldo - monto);
    }
    
    public void Mostrar(){
        System.out.println(" Titular;");
        System.out.println("Nombre: "+this.titular.getNombre());
        System.out.println("Apellido: "+this.titular.getApellido());
        System.out.println("Edad: "+this.titular.getEdad());
        System.out.println("Nro de Cuenta: "+this.nroCuenta);
        System.out.println("Saldo: "+this.saldo);
    }
}
