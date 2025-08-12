import java.util.Scanner;

public class CalculaCirculos {
    public static final int TAM = 10;
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Circulo[] c = new Circulo[TAM];

        for(int i = 0; i < c.length; i++){
            System.out.print("Digite o raio do circulo " + (i+1) + ": ");
            double raio = input.nextDouble();
            c[i] = new Circulo(raio);
        }

        for(int i = 0; i < c.length; i++){
            System.out.println("Area e comprimento do circulo " + (i+1));
            System.out.println("Raio: " + c[i].area());
            System.out.printf("Comprimento: %.2f\n", c[i].comprimento());
        }
        
    }
    
    public static void CriaRaio(Circulo c){
        System.out.print("Digite o raio: ");
        c.raio = input.nextDouble();
    }
}
