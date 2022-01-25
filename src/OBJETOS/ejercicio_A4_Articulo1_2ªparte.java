
package OBJETOS;

import java.util.Scanner;

public class ejercicio_A4_Articulo1_2ªparte {


    public static void main(String[] args) {
        
//Añade un constructor con 4 parámetros que asigne valores a nombre, precio, iva y
//cuantosQuedan. Dicho constructor deberá mostrar un mensaje de error si alguno de los valores
//nombre, precio, iva o cuantosQuedan no son válidos. ¿Qué condiciones crees que podrían
//determinar si son válidos o no? Razónalo e implementa el código.
//Corrige el main y prueba a crear varios artículos. Introduce algunos con valores incorrectos para
//comprobar si avisa del error.
 

        Scanner leer = new Scanner(System.in);
        
        articulo_2ªparte articulo = new articulo_2ªparte("PC",500.50,15,200);
        
        
        
       /*  System.out.println("¿Cual es el artículo? ");
            articulo.nombre = leer.nextLine();
        System.out.println("¿Cual es el precio? ");
            articulo.precio = leer.nextDouble();
        System.out.println("¿Qué IVA tiene el artículo? ");
            articulo.iva = leer.nextDouble();
        System.out.println("El precio de venta al público es " + (((articulo.precio*articulo.iva)/100)+articulo.precio));  */  
    } 
}
