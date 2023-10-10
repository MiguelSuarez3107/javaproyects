package ejemploHerencia;

public class VCilindro extends VEsfera{
    private double h;
    
    public VCilindro(){
        h=0;
    }
    
    public double pedirAltura(){
        System.out.println("Digite un valor para la altura del cilindro");
    }
    
    public double calcularVCilindo(){
      double vc=calcularAreaC()*h;
      return vc;
    }
}
