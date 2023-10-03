package ascensor;
import java.util.*;

public class Ascensor {
    private int piso;
    
public Ascensor(){
this.piso = (int)(Math.random()*7+1); 
}

public void setPisoArriba(int piso){
this.piso=piso+1;
}

public void setPisoAbajo(int piso){
this.piso=piso-1;
}
    
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();
        Pantalla pantalla = new Pantalla();
        PedirPiso pedirPiso = new PedirPiso();
        Scanner leer = new Scanner(System.in);
        
        pedirPiso.setPisoPedido((int)(Math.random()*7+1));
        pantalla.setPiso(ascensor.piso);
        
        System.out.println("Usted se encuentra en el piso: "+pedirPiso.getPisoPedido());
        System.out.println("Pantalla: "+pantalla.getPiso());
        System.out.println("Desea llamar el ascensor a su piso?\n 1)Si\n 2)No\n Ingrese su eleccion:");
        int opcion = leer.nextInt();
        
        if(opcion==1){
           if(ascensor.piso > pedirPiso.getPisoPedido()){
              do{
              System.out.println("Pantalla: "+pantalla.getPiso());
              ascensor.setPisoAbajo(ascensor.piso);
              pantalla.setPiso(ascensor.piso);
              }while(ascensor.piso!=pedirPiso.getPisoPedido());
              
              System.out.println("Pantalla: "+pantalla.getPiso());
              System.out.println("El ascensor ya esta en tu piso, buen viaje ;)");
            }
           else if(ascensor.piso < pedirPiso.getPisoPedido()){  
              do{
              System.out.println("Pantalla: "+pantalla.getPiso());
              ascensor.setPisoArriba(ascensor.piso);
              pantalla.setPiso(ascensor.piso);
              }while(ascensor.piso!=pedirPiso.getPisoPedido());
              
              System.out.println("Pantalla: "+pantalla.getPiso());
              System.out.println("El ascensor ya esta en tu piso, buen viaje ;)");
            }
           else {
              System.out.println("El ascensor ya esta en tu piso, buen viaje ;)");
            }
        }
        else{
            System.out.println("Tenga un buen dia utilizando las escaleras :)");
        } 
    }
} 

