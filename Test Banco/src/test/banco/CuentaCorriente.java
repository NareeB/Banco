
package test.banco;

/**
 *
 * @author plaga(c)
 * @date Mar 3, 2018
 * @time 9:23:20 AM
 */
public class CuentaCorriente {
    //Atributos
    private Cliente titular;
    private int nroCuenta;
    private double saldo;
    
    //Getters y setters
    public void setTitular(Cliente titular){
        this.titular = titular;
    }
    public void setNroCuenta(int nroCuenta){
        this.nroCuenta = nroCuenta;
    }
    public void setSaldo(double saldo){
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
    
    //Constructores de Cuenta Corriente
    public CuentaCorriente(Cliente titular, int nroCuenta, double saldo){
        this.titular = titular;
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }
    public CuentaCorriente(Cliente titular, int nroCuenta){
        this.titular = titular;
        this.nroCuenta = nroCuenta;
    }
    
    //Metodos para depositos y extracciones de dinero en la cuenta corriente
    public void Depositar(double monto){
        this.saldo = (saldo + monto);
    }
    public void Extraer(double monto){
        if (monto > saldo){
            System.out.println("Saldo insuficiente para extracción");
        }
        else
            this.saldo = (saldo - monto);
    }
    
    //Sobreescritura para devolver los atributos
    @Override
    public String toString(){
        return titular.toString()+"\nN. Cuenta: "+nroCuenta+
        "\nSaldo: "+saldo;
    }
    
    //Sobreescrituta para comparar los numeros de cuenta.
    @Override
    public boolean equals(Object n){
        if (n == null || !(n instanceof CuentaCorriente))
            return false;
        boolean iguales = false;
        CuentaCorriente c = (CuentaCorriente) n;
        if (c.nroCuenta == this.nroCuenta){
            iguales = true;
        }   
        return iguales;
    }
    
    /**public void Mostrar(){
        System.out.println(" Titular;");
        System.out.println("Nombre: "+this.titular.getNombre());
        System.out.println("Apellido: "+this.titular.getApellido());
        System.out.println("Edad: "+this.titular.getEdad());
        System.out.println("Nro de Cuenta: "+this.nroCuenta);
        System.out.println("Saldo: "+this.saldo);
    }*/
}
