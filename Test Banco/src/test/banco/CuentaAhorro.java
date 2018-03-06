package test.banco;
/**
 *
 * @author Nareyii
 * @date Mar 6, 2018
 * @time 8:49:05 AM
 */
public class CuentaAhorro extends CuentaCorriente{
    private double interes = 2.5;

    public CuentaAhorro(Cliente titular, int nroCuenta, double saldo, double interes) {
        super(titular, nroCuenta, saldo);
        this.interes = interes;
    }
    
    public CuentaAhorro(Cliente titular, int nroCuenta, double interes){
        super(titular, nroCuenta);
        this.interes = interes;
    }

    public CuentaAhorro(Cliente titular, int nroCuenta) {
        super(titular, nroCuenta);
    }
    
    public void setInteres(){
        this.interes = interes;
    }
    public double getInteres(){
        return interes;
    }
    
    public double CalcularInteres(){
        
    }

}
