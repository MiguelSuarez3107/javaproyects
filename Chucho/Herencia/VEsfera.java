package ejemploHerencia;

public class VEsfera extends ACirculo{
    
    public VEsfera(){
    }
    
    public double calcularVEsfera(){
        double ve=(4*super.calcularAreaC()*super.getR())/3;
        return ve;
    }
}
