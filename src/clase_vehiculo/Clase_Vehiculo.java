
/**
 * Manuel Flores
 */

package clase_vehiculo;

public class Clase_Vehiculo {

    public static void main(String[] args) {
        int opcionMenuPrincipal = 0;
        Vehiculo bici = null;
        Vehiculo coche = null;
        
        try{
            bici = new Vehiculo ("Bicicleta", 0, 20);
        }catch (Exception e){
            ES.msgln(e.getMessage());
        }
        
        try{
            coche = new Vehiculo ("Coche", 0, 120);
        }catch (Exception e){
            ES.msgln(e.getMessage());
        }
        
        
        String menuPrincipal =
            "-----------------------------\n" +
            "1. Acelerar la bici\n" +
            "2. Acelerar coche\n" +
            "3. Frenar bici\n" +
            "4. Frenar coche\n" +
            "5. Ver velocidad de la bici\n" +
            "6. Ver velocidad del coche\n" +
            "7. Terminar\n" +
            "-----------------------------";
        do{
            opcionMenuPrincipal = ES.leeEntero(menuPrincipal, 1, 7);
            switch (opcionMenuPrincipal){
                case 1:
                    submenuAcelerar(bici);
                    break;
                case 2:
                    submenuAcelerar(coche);
                    break;
                case 3:
                    submenuFrenar(bici);
                    break;
                case 4:
                    submenuFrenar(coche);
                    break;
                case 5:
                    submenuVerVelocidad(bici);
                    break;
                case 6:
                    submenuVerVelocidad(coche);
                    break;
                case 7:
                    ES.msg("Fin de programa");
                    break;
            }
        }while (opcionMenuPrincipal != 7);
    }//fin main
    
    static void submenuAcelerar(Vehiculo vehiculo){
        int unidadesAceleracion = 0;
        unidadesAceleracion = ES.leeEntero("¿Cuántas unidades acelero?: ", 1);
        vehiculo.acelerar(unidadesAceleracion);
    }
    
    static void submenuFrenar(Vehiculo vehiculo){
        int unidadesFrenado = 0;
        unidadesFrenado = ES.leeEntero("¿Cuántas unidades freno?:", 1);
        vehiculo.frenar(unidadesFrenado);
    }
    
    static void submenuVerVelocidad (Vehiculo vehiculo){
        ES.msgln("La velocidad de " + vehiculo.getNombre() + " es " + vehiculo.getVelocidad());
    }
}//fin class