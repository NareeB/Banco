package test.banco;

/**
 *
 * @author Nareyii
 */
public class TestBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Testeo de cuentas corrientes
        /*Cliente personita = new Cliente();
        personita.setNombre("Narela Soledad");
        personita.setApellido("Bauer");
        personita.setEdad(19);
        Cliente amor = new Cliente();
        amor.setNombre("Gonzalo Hernán");
        amor.setApellido("Velasco");
        amor.setEdad(19);
        CuentaCorriente c1 = new CuentaCorriente(personita,41324859,70.50);
        CuentaCorriente c2 = new CuentaCorriente(amor,41324859,1502.00);
        if (c1.equals(c2)){
        System.out.println("Cuentas iguales.");
        }else
            System.out.println("Cuentas distintas.");
        */
        
        //Testeo de cuentas de ahorros
        Cliente yo = new Cliente();
        yo.setNombre("Narela Soledad");
        yo.setApellido("Bauer");
        yo.setEdad(19);
        Cliente amor = new Cliente();
        amor.setNombre("Gonzalo Hernan");
        amor.setApellido("Velasco");
        amor.setEdad(19);
        CuentaAhorro ca1 = new CuentaAhorro(yo,41324859,70.5,0.0);
        CuentaAhorro ca2 = new CuentaAhorro(amor,41324835,1502.0,0.0);
        System.out.println(ca1.toString());
        System.out.println(ca2.toString());
        if (ca1.equals(ca2))
            System.out.println("Cuentas iguales.");
        else
            System.out.println("Cuentas distintas.");
    }
    
}
