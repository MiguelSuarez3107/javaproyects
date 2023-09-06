package dog;
public class Dog {
String raza;
boolean conDueño;
int edad;

public Dog(String razaPerro, boolean tieneDueño, int edadPerro){
System.out.println("Analizado el perro");
raza = razaPerro;
conDueño = tieneDueño;
edad = edadPerro;
}
    
    public static void main(String[] args) {
        System.out.println("EL programa empieza");
        Dog fido = new Dog("poodle", false, 4);
        Dog nunzio = new Dog("Shiba inu", true, 12);
        boolean fidoEsMayor = fido.edad > nunzio.edad;
        int añosTotales = nunzio.edad + fido.edad;
        System.out.println("Se crearon dos perros, un " + fido.raza + " y un " + nunzio.raza);
        System.out.println("Fido es mas viejo que nunzio?: " + fidoEsMayor);
        System.out.println("El total de edades entre los perros es: " + añosTotales);
        System.out.println("El programa termina");
    }
    
}
