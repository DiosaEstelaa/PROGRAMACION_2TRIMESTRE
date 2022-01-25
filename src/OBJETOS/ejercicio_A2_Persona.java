
package OBJETOS;

import java.util.Scanner;


public class ejercicio_A2_Persona {

    public static void main(String[] args) {
        
//Crea un programa con una clase llamada Persona que representará los datos principales de una
//persona: dni, nombre, apellidos y edad.
//En el main de la clase principal instancia dos objetos de la clase Persona. Luego, pide por teclado
//los datos de ambas personas (guárdalos en los objetos). Por último, imprime dos mensajes por
//pantalla (uno por objeto) con un mensaje del estilo “Azucena Luján García con DNI … es / no es
//mayor de edad”
        
        Scanner leer = new Scanner(System.in);

        persona persona1 = new persona();
        persona persona2 = new persona();
        
        System.out.println("Introduce los datos de la primera persona: ");
        System.out.println("¿Cual es el nombre? ");
            persona1.nombre = leer.nextLine();
        System.out.println("¿Cual es su apellido? ");
            persona1.apellidos = leer.nextLine();
        System.out.println("¿Cual es su dni? ");
            persona1.dni = leer.nextLine();
        System.out.println("¿Cual es su edad? ");
            persona1.edad = leer.nextByte();
            
        System.out.println("Introduce los datos de la segunda persona: ");
        System.out.println("¿Cual es el nombre? ");
            persona2.nombre = leer.nextLine();
        System.out.println("¿Cual es su apellido? ");
            persona2.apellidos = leer.nextLine();
        System.out.println("¿Cual es su dni? ");
            persona2.dni = leer.nextLine();
        System.out.println("¿Cual es su edad? ");
            persona2.edad = leer.nextByte();
       
        if(persona1.edad>=18){
            
            System.out.println("  " + persona1.nombre + " " + persona1.apellidos + " " + " con Dni " + persona1.dni + " es mayor de edad");
            
        }else{
            
           System.out.println("  " + persona1.nombre + " " + persona1.apellidos + " " + " con Dni " + persona1.dni + " NO es mayor de edad"); 
            
        }
        
        if(persona2.edad>=18){
            
            System.out.println("  " + persona2.nombre + " " + persona2.apellidos + " " + " con Dni " + persona2.dni + " es mayor de edad");
            
        }else{
            
           System.out.println("  " + persona2.nombre + " " + persona2.apellidos + " " + " con Dni " + persona2.dni + " NO es mayor de edad"); 
            
           
           
        
        }
    }
}
