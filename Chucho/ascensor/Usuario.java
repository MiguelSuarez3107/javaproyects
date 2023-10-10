package usuario;
import java.util.*;

public class Usuario {
    private int pisoUsuario;
    
    public int getPiso(){
    return this.pisoUsuario;
    }
    
    public void setPiso(int pisoUsuario){
    this.pisoUsuario = pisoUsuario;
    }
    
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        Ascensor ascensor = new Ascensor();
        Scanner boton = new Scanner(System.in);
        
    usuario.setPiso((int)(Math.random()*7+1));
    ascensor.setPiso((int)(Math.random()*7+1));
    
    System.out.println("Piso usuario: "+usuario.getPiso()+"\nPiso Ascensor: "+ascensor.getPiso());
    System.out.println("Presione 1 para llamar ascensor:");
    int llamado = boton.nextInt();
    
    if (llamado==1){
       if (usuario.getPiso() < ascensor.getPiso()){
         while(usuario.getPiso()-1 != ascensor.getPiso()){
         System.out.println("Ascensor en el piso: "+ascensor.getPiso());
         ascensor.setPiso(ascensor.getPiso()-1);
         }
       }
       else{
         while(usuario.getPiso()+1 != ascensor.getPiso()){
         System.out.println("Ascensor en el piso: "+ascensor.getPiso());
         ascensor.setPiso(ascensor.getPiso()+1);
         }
       }
    System.out.println("El ascensor ha llegado a su piso.");
    }
  }   
}
