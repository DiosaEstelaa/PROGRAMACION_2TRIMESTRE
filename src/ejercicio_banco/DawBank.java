
package ejercicio_banco;

import java.util.Scanner;

public class DawBank {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
            int opcion;
            String iban = "" ;
            String titular = "" ;
            double saldo = 0;
            double ingreso = 0;
            double retirada = 0; 
            int movimientos = 0; 
        
        CuentaBancaria cuenta = new CuentaBancaria();
        
    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");                          
        
    System.out.println("Introduce el IBAN (contiene un total de 24 carácteres, primero 2 letras y luego 22 números): "); //pedimos el puto IBAN
           
        introducirIban(iban);  
        
        cuenta.setIban(iban); // con esto guardamos el iban modificado en el objeto setIban
            
    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");                  
            
        
    System.out.println("Introduce el nombre del titular: ");
            
        introducirTitular(titular);
        
        cuenta.setTitular(titular); // con esto guardamos el titular modificado en el objeto setTitular
                  
    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");                  
                    
    //comienza el menú:
    
        do{ //metemos las opciones del menú en un do-while para que hasta que no pulsemos el caso ' 8 ' no acabe el programa. 
            
            Menu(); // mostramos el menú
            
            opcion = leer.nextInt(); // introducimos que opción del menú queremos
            
            while(opcion<1 || opcion>8){ // este while es para que nos repita el menú en el caso de que el número que introduce el usuario está fuera del rango 1-8
                
                System.out.println("ERROR. El número a introducir debe ser entre '1' y '8' ");
                
                Menu(); // volvemos a mostrar el menú
                
                opcion = leer.nextInt();
                
            } // fin while (opcion<1 || opcion>8)
            
            switch(opcion){
                
                case 1:
                    
                    iban = cuenta.getIban();
                    titular = cuenta.getTitular();
                    saldo = cuenta.getSaldo();
                    
                    System.out.println("el IBAN: " + iban + " cuyo titular es: " + titular + " con saldo: " +  saldo);
                    
                    break;
                
                case 2:
                    
                    iban = cuenta.getIban();
                    System.out.println("El IBAN es: " + iban );
                    
                    break;
                    
                case 3:
                    
                    titular = cuenta.getTitular();
                    System.out.println("El titular es: " + titular);
                    
                    break;
                    
                case 4:
                    
                    saldo = cuenta.getSaldo();
                    System.out.println("El saldo es disponible es: " + saldo  );
                    
                    break;
                    
                case 5:
                    
                    ingresoMoney (saldo, movimientos);
                    cuenta.setSaldo(saldo); 
                    
                    break;
                
                case 6:
                    
                    retiradaMoney (saldo, movimientos);
                    cuenta.setSaldo(saldo); 
                    
                    break;
                    
                case 7:
                    
                    movimientos = cuenta.getMovimientos();
                    verMovimientos(movimientos);
                    cuenta.setMovimientos(movimientos);
                    
                    break;
                    
                case 8:
                    
                    System.out.println("Muchas gracias, vuelva pronto (por mi no vuelvas, pesadx). ");
                    
                    break;
                    
                default: 
                    
                    System.out.println("Opción incorrecta  ");
                    
                    break;
                                    
              
            } // fin switch
            
        }while(opcion!=8);
        
 
    } //fin public static void main
     
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//función para mostrar el menú
    
    public static void Menu(){
        
        System.out.println("1. Datos de la cuenta.");
        System.out.println("2. IBAN. ");
        System.out.println("3. Titular.");
        System.out.println("4. Saldo. ");
        System.out.println("5. Ingreso. ");
        System.out.println("6. Retirada. ");
        System.out.println("7. Movimientos. ");
        System.out.println("8. Salir. ");
 
    } // fin menu
    
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    

//función  para comprobar IBAN 
    
    public static boolean comprobarIban(String iban_f){ // la función para comprobar si el puto usuario ha metido bien el número de carácteres del puto IBAN.
        
        if((iban_f.length()==24) && (iban_f.substring(0,1).toUpperCase().equals("E")) && (iban_f.substring(1,2).toUpperCase().equals("S"))) { 
            
        // con el iban_f.lenth()==24 comprobamos si ha metido 24 carácteres
        //y con el iban_f.substring(0,1).toUpperCase().equals("E") comprobamos que la primera letra introducida sea una ' E ' en mayúsculas
            
             return true; //nos devolverá un true
             
        }else{ // si el puto usario puto mete mal el puto IBAN. Pos false. Porque es que es tontx sabes? PFFFFFF.
            
            return false;
        }  
    }
    
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    

//función para validar el nombre
    
    public static boolean validarNombre(String nombre_f){
        
    boolean checkStatus=false;
    
    /*Verificamos que no sea null*/ 
    
    if(nombre_f != null){
        /* 1ª Condición: que la letra inicial sea mayúscula*/
        boolean isFirstUpper=Character.isUpperCase(nombre_f.charAt(0));

        /* 2ª Condición: que el tamaño sea >= 3 y <= 15*/
        int stringSize=nombre_f.length();
        boolean isValidSize=(stringSize >= 3 && stringSize <= 15);

        /* 3ª Condición: que contenga al menos un espacio*/
        boolean isSpaced=nombre_f.contains(" ");

        /* Verificamos que las tres condiciones son verdaderas*/
        checkStatus= ( (isFirstUpper==true)  && (isFirstUpper && isValidSize &&  isSpaced) );
    }
    /*Devolvemos el estado de la validación*/
    return checkStatus;
}
         
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    

//función para pedir el iban
    
    public static void introducirIban(String iban_f){
        
        Scanner leer = new Scanner(System.in);
        
        iban_f = leer.nextLine(); //leemos el puto IBAN
            
            do{  // hacemos este bucle para que hasta que no meta el puto usuario el puto IBAN bien no pueda seguir avanzando el programa.
            
                if(comprobarIban(iban_f)==true){ // si son 24 putos caracteres guay, seguimos pa' lante

                    System.out.println("El número de carácteres introducido es correcto. "); // Mensajito formal para el puto usuario

                }else{ // si el puto usuario es imbécil y ha metid mal el IBAN (incluso habiéndolo avisado anteriormente) le hacemos repetirlo. Puf es que lo mato eh. 

                   System.out.println("El número de carácteres introducido es incorrecto. Vuleva a intentarlo (recuerde que primero 2 letras y luego 22 números): "); // Mensajito formal cuando lo que querría es partirle la cara por tontx

                    iban_f = leer.nextLine(); // volvemos a pedirle que introduzca el IBAN mientras rezamos para que esta vez lo haga bien y no me de mas razones para pensar que es tontx del culo
                
                } //fin else
            
            }while(comprobarIban(iban_f)==false);       
        
    } // fin función introducirIban

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    

//función para pedir el titular
    
    public static void introducirTitular(String titular){
        
        Scanner leer = new Scanner(System.in);

        titular = leer.nextLine();
            
            do{
                
                if(validarNombre(titular)==true){
                    
                    System.out.println("El nombre del titular introducido es correcto. ");
                    
                }else{
                    
                    System.out.println("El nombre del titular introducido es incorrecto. Vuelva a intentarlo: ");
                    
                    titular = leer.nextLine();

                } // fin else
                
            }while(validarNombre(titular)==false); 
        
    } // fin función pedirTitular
    
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    

// función para ingresar los dineros

    public static double ingresoMoney (double saldo, int movimientos){
        
        double cantidad = 0;
        boolean operacion_saldo = true;
        
        System.out.println("Introduzca la cantidad que desea ingresar: ");
        
        cantidadSaldo(cantidad, saldo, operacion_saldo);
        
        saldo = saldo + cantidad;
        
        movimientos++;
        
        System.out.println(" Su saldo es: " + saldo);
        
        return saldo;
        
    } // fin función ingresoMoney
    
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    

// función para retirar los dineros

    public static double retiradaMoney (double saldo, int movimientos){
        
        double cantidad = 0;
        boolean operacion_saldo = false;
        
        System.out.println("Introduzca la cantidad que desea retirar: ");
        
        cantidadSaldo(cantidad, saldo, operacion_saldo);
        
        saldo = saldo - cantidad;
        
        movimientos++;
        
        System.out.println(" Su saldo es: " + saldo);
        
        return saldo;
        
    } // fin función retiradaMoney
    
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    

// función para ver los movimientos

    public static int verMovimientos (int movimientos){
        
        if (movimientos<=100){
            
            System.out.println(" Has realizado un total de " + movimientos + " movimientos ");
            
        }else{
            
            System.out.println("Has realizado más de 100 movimientos mi siela");
        }
        
        return movimientos;
        
    } // fin función verMovimientos
    
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    

// función para el saldo
    
    public static double cantidadSaldo (double cantidad, double saldo, boolean operacion_saldo){
        
        Scanner leer = new Scanner(System.in);

        int operacion = 0;
        
        if(operacion_saldo==false){
            
            cantidad = leer.nextDouble();
            
            while ((saldo<cantidad) || (cantidad<=0 && operacion!=2)){
                
                System.out.println("ERROR. La cantidad que desea retirar no es válida ");
                System.out.println("Pulse ' 1 '  para introducir de nuevo la cantidad que de desea retirar ");
                System.out.println("Para salir pulse ' 2 ' ");
                    operacion = leer.nextInt();
                    
                    while ((operacion!=1) || (operacion!=2)){
                        
                        System.out.println("JODER TE HE DICHO QUE PULSES '1' o '2' . VUELVE A INTRODUCIR UNA DE LAS DOS PUTAS OPCIONES ");  
                            operacion = leer.nextInt();
                            
                    } // fin segundo while
                    
                    switch(operacion){
                        
                        case 1:
                            
                            System.out.println("Introduzca la cantidad que desea retirar: ");
                            cantidad = leer.nextDouble();
                            
                            break;
                            
                        case 2:
                            
                            System.out.println(" Decidiste ' salir ' y menos mal porque eres una pesadilla. QUE TE VAYA BONITO ");
                            
                            break;
                        
                    } // fin switch
                    
            } // fin primer while
            
        }else{
            
            cantidad = leer.nextDouble();
            
            while ((cantidad==0) && (operacion!=2)){
                
                System.out.println("ERROR. La cantidad que desea retirar no es válida ");
                System.out.println("Pulse ' 1 '  para introducir de nuevo la cantidad que de desea retirar ");
                System.out.println("Para salir pulse ' 2 ' ");
                    operacion = leer.nextInt();
                    
                    while ((operacion!=1) || (operacion!=2)){
                        
                        System.out.println("JODER TE HE DICHO QUE PULSES '1' o '2' . VUELVE A INTRODUCIR UNA DE LAS DOS PUTAS OPCIONES ");  
                            operacion = leer.nextInt();
                            
                    } // fin segundo while
                    
                    switch(operacion){
                        
                        case 1:
                            
                            System.out.println("Introduzca la cantidad que desea retirar: ");
                            cantidad = leer.nextDouble();
                            
                            break;
                            
                        case 2:
                            
                            System.out.println(" Decidiste ' salir ' y menos mal porque eres una pesadilla. QUE TE VAYA BONITO ");
                            
                            break;
                        
                    } // fin switch
                    
            } // fin primer while
            
        } // fin if-else
            
        return cantidad;
       
    } // fin función cantidadSaldo
    
}//fin public class
