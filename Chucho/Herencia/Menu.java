package ejemploHerencia;

import java.util.*;

public class Menu {
    
    VEsfera objVE;
    
    public Menu(){
    objVE=new VEsfera();
    }
    
    public void menu(){
        System.out.println("1. Area Circulo");
        System.out.println("2. Volumen Esfera");
        System.out.println("3. Volumen Cilindro");
        System.out.println("Cualquier numero salir");
        Scanner s=new Scanner(System.in);
        int opcion = s.nextInt();
        
        if(opcion == 1){
           objVE.Mostrar(objVE.calcularAreaC(), "El area del circulo es: ");
        }
        else{
           if(opcion == 2){
               objVE.Mostrar(objVE.calcularVEsfera(), "El volumen de la esfera es: ");
           }
           else{
               if(opcion == 3){
                   objVE.Mostrar(objVE.);}
               else{
               }
           }
        }
    }
}
