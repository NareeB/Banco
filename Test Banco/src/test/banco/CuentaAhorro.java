package test.banco;
/**
 *
 * @author Nareyii
 * @date Mar 6, 2018
 * @time 8:49:05 AM
 */
public class CuentaAhorro extends CuentaCorriente{
    //Atributos
    private double interes = 2.5;
    
    //Constructores, que heredan metodos de la clase padre.
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
    
    //Get y set
    public void setInteres(double interes){
        this.interes = interes;
    }
    public double getInteres(){
        return this.interes;
    }
    
    //Metodo para calcular el interes con el interes del atributo ya inicializado
    public double CalcularInteres(){//Al no recibir el interes, utiliza el interes
        //inicializado en la clase.
        //Se le suma uno para que directamente devuelva el saldo incrementado.
        return super.getSaldo()*(1+this.interes/100);
    }
    //Metodo para calcular el interes con un valor que el usuario desee
    public double CalcularInteres(double interes){
        return super.getSaldo()*(1+interes/10);
    }
    
}