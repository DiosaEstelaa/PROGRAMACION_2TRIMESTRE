
package OBJETOS;

import java.util.Scanner;


public class ejercicio_A2_Persona1_2ªparte {

    public static void main(String[] args) {
        
//Crea un programa con una clase llamada Persona que representará los datos principales de una
//persona: dni, nombre, apellidos y edad.
//En el main de la clase principal instancia dos objetos de la clase Persona. Luego, pide por teclado
//los datos de ambas personas (guárdalos en los objetos). Por último, imprime dos mensajes por
//pantalla (uno por objeto) con un mensaje del estilo “Azucena Luján García con DNI … es / no es
//mayor de edad”
        
        Scanner leer = new Scanner(System.in);

        persona_2ªparte persona1 = new persona_2ªparte("12345678A","Pepa","Azul",45);
        persona_2ªparte persona2 = new persona_2ªparte("87654321A","Pepe","Rojo",86);
        
        
       
        if(persona1.getEdad()>=18){
            
            System.out.println("  " + persona1.getNombre() + " " + persona1.getApellidos() + " " + " con Dni " + persona1.getDni() + " es mayor de edad");
            
        }else{
            
           System.out.println("  " + persona1.getNombre() + " " + persona1.getApellidos() + " " + " con Dni " + persona1.getDni() + " NO es mayor de edad"); 
            
        }
        
        if(persona2.getEdad() >=18){
            
            System.out.println("  " + persona2.getNombre() + " " + persona2.getApellidos() + " " + " con Dni " + persona2.getDni() + " es mayor de edad");
            
        }else{
            
           System.out.println("  " + persona2.getNombre() + " " + persona2.getApellidos() + " " + " con Dni " + persona2.getDni() + " NO es mayor de edad"); 
            
        }
        
        persona2.setDni("13579246P");
        System.out.println("  " + persona2.getNombre() + " " + persona2.getApellidos() + " " + " con Dni " + persona2.getDni());
    }
}
