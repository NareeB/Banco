
package test.banco;

/**
 *
 * @author plaga(c)
 * @date Mar 3, 2018
 * @time 9:23:07 AM
 */
public class Cliente {
    //Atributos
    private String nombre;
    private String apellido;
    private int edad;

    //Getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Sobreescritura para devolver los atributos
    @Override
    public String toString(){
        return "Nombre: "+this.nombre+"\nApellido: "+this.apellido+"\nEdad: "+this.edad;
    }
    
}
