
package OBJETOS;


public class persona_2ªparte {
    
    private String nombre, dni, apellidos;
    private int edad;
    
    public persona_2ªparte(String dni, String nombre, String apellidos, int edad) {
    this.dni = dni;
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.edad = edad;
}
    
    public String getDni (){
        
        return dni;
        
    }
    
    public void setDni (String dni){
        
        this.dni = dni;
        
    }
    
      public String getNombre (){
        
        return nombre;
        
    }
    
    public void setNombre (String nombre){
        
        this.nombre = nombre;
        
    }
    
      public String getApellidos (){
        
        return apellidos;
        
    }
    
    public void setApellidos (String apellidos){
        
        this.dni = apellidos;
        
    }
    
    public int getEdad () {
        
        return edad;
        
    }
    
    public void setEdad (int edad){
        
        this.edad = edad;
        
    }
    
}
