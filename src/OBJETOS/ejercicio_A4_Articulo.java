
package OBJETOS;

import java.util.Scanner;

public class ejercicio_A4_Articulo {


    public static void main(String[] args) {
        
//Crea un programa con una clase llamada Articulo con los siguientes atributos: nombre, precio (sin
//IVA), iva (siempre será 21) y cuantosQuedan (representa cuantos quedan en el almacén).
//En el main de la clase principal instancia un objeto de la clase artículo. Asígnale valores a todos sus
//atributos (los que quieras) y muestra por pantalla un mensaje del estilo “Pijama - Precio:10€ -
//IVA:21% - PVP:12,1€” (el PVP es el precio de venta al público, es decir, el precio con IVA). Luego,
//cambia el precio y vuelve a imprimir el mensaje.        

        Scanner leer = new Scanner(System.in);
        
        articulo articulo = new articulo();
        
        System.out.println("¿Cual es el artículo? ");
            articulo.nombre = leer.nextLine();
        System.out.println("¿Cual es el precio? ");
            articulo.precio = leer.nextDouble();
        System.out.println("¿Qué IVA tiene el artículo? ");
            articulo.iva = leer.nextDouble();
        System.out.println("El precio de venta al público es " + (((articulo.precio*articulo.iva)/100)+articulo.precio));    
    } 
}
