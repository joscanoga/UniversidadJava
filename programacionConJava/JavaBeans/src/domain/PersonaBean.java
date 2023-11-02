
package domain;
import java.io.Serializable;
/**
 *
 * @author johan
 */
public class PersonaBean implements Serializable {
    //todos los atributos deben ser privados
    private String nombre;
    private String apellido;
    
    //debe tener constructor vacio
    public PersonaBean() {
    }

    public PersonaBean(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    //se debe tener un getter an setter para cada uno de los atributos
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

    @Override
    public String toString() {
        return "PersonaBean{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }

    
}
