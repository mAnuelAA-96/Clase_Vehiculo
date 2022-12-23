
/**
 * Manuel Flores
 */

package clase_vehiculo;

public class Vehiculo {
    private String nombre;
    private int velocidad;
    private int velocidadMaxima;
    
    Vehiculo (String nombre, int velocidad, int velocidadMaxima) throws Exception{
        if (velocidad < 0){
            throw new Exception ("La velocidad inicial no puede ser inferior a 0.");
        }
        if (velocidadMaxima <= velocidad){
            throw new Exception ("La velocidad máxima del vehículo no puede ser inferior a la velocidad actual");
        }
        
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.velocidadMaxima = velocidadMaxima;
    }
    
    //getters
    public String getNombre(){
        return nombre;
    }
    
    public int getVelocidad(){
        return velocidad;
    }
    
    public int getVelocidadMaxima(){
        return velocidadMaxima;
    }
    
    //setters
    public void setNombre(){
        String nombre = null;
        ES.leeCadena();
        this.nombre = nombre;
    }
    
    private void establecerVelocidad(int nuevaVelocidad){
        if (nuevaVelocidad <= velocidadMaxima){
            velocidad = nuevaVelocidad;
        }else{
            System.out.println ("La nueva velocidad no puede exceder la velocidad máxima");
        }
        
        if (nuevaVelocidad < 0){
            System.out.println ("La nueva velocidad no puede ser menor que 0.");
        }
    }
    
    public void acelerar(int incremento){
        if (incremento > 0){
            establecerVelocidad (velocidad + incremento);
        }else{
            System.out.println ("La aceleración no puede ser inferior a 0");
        }
    }
    
    public void frenar(int decremento){
        if (decremento > 0){
            establecerVelocidad (velocidad - decremento);
        }else{
            System.out.println ("El frenado no puede ser inferior a 0");
        }
    }
    
    
    
}//fin public class Vehiculo

