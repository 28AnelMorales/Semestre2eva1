package eva1_7_metodos;

/**
 *
 * @author invitado
 */
public class Persona {
   /*Nombre, apellidos, edad*/
    private String nombre;
    private String apellidos;
    private int edad;

    //Get Set
    public String getNombre() {
        return nombre;
    }
    
     public void setNombre(String valor) {
        nombre = valor;
    }
    public String getApellidos() {
        return apellidos;
    }
    
    public void setApellidos(String valor) {
        apellidos = valor;
    }
    
    public int getEdad() {
        return edad;
    }
    
     public int setEdad(int valor) {
        return edad;
    }
     
     //reglas para el nombre de los métodos en java
     //es un verbo, empieza en minúsculas
     
     public String generarNombrecom(){
        return nombre + " " + apellidos;
         
     }
 
     //calcular año de nacimientos
     public int calcularAnnioNac(){
        return 2024 - edad;
         
     }

  
}
