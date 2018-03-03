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
        
        Cliente personita = new Cliente();
        personita.setNombre("Narela Soledad");
        personita.setApellido("Bauer");
        personita.setEdad(19);
        CuentaCorriente c1 = new CuentaCorriente(personita,41324859,70.50);
        c1.Mostrar();
        
    }
    
}
