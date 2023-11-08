
package test;

import abstracta.*;

public class TestAbstrac {

 
    public static void main(String[] args) {
      FiguraGeometrica figura=new Rectangulo("Rectangulo1");
      figura.dibujar();
      
      figura=new Cuadrado("Circulo1");
      figura.dibujar();
    }
    
}
