
package eva1_1_instanciacion;


public class EVA1_1_instanciacion {

  
    public static void main(String[] args) {
      int valor = 100;
    //clase  identificador = new Constructor();
        Persona perso1 = new Persona();// A ESTO SE LE LLAMA INSTANCIACION
       // System.out.println(perso1);
            //IDENTIFICADOR ------> REFERENCIA  ---> direccion de memoria 
            
           
        Vehiculo car = new Vehiculo();    
            
        car.marca = "Chevrolet";
        car.modelo = "Chevy";
        car.year = 2001;
       
        System.out.println("Marca: " + car.marca );
        System.out.println("Modelo: " + car.modelo);
        System.out.println("Año: " + car.year);
              
    }
    
}
 class Persona{
 
 
 }

class Vehiculo{
  //ATRIBUTOS
    
String marca;
int year;
String modelo;

}