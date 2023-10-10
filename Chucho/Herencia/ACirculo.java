package ejemploHerencia;

import java.util.*;

public class ACirculo {
   private double r;
   
   public ACirculo(){
   r=0;
   }
   
   public void setR(double r){
   this.r=r;
   }
   
   public double getR(){
   return this.r;
   }
   
   public double pedirDato(String x){
       System.out.println("Digite un valor "+ x);
       Scanner s=new Scanner(System.in);
       return s.nextDouble();
   }
   
   public double calcularAreaC(){
   r=pedirDato("para el radio");
   return Math.PI*Math.pow(r, 2);
   }
   
   public void Mostrar(double v, String z){
       System.out.println(z+v);
   }
   
}
