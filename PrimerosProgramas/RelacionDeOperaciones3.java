package relaciondeoperaciones3;
public class RelacionDeOperaciones3 {
    public static void main(String[] args) {
    double aguaRecomendada = 8;
    double diasDelDesafio = 30;
    double aguaBebida = 235.5;
    double totalAguaRecomendada = aguaRecomendada*diasDelDesafio;
    boolean elDesafioSeSupero = aguaBebida >= totalAguaRecomendada;
        System.out.println(elDesafioSeSupero);
    }
}
