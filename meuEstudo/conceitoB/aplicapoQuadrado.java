public class aplicapoQuadrado {

    public static void main(String[] args) {
        Quadrado q1 = new Quadrado();
        Quadrado q2 = new Quadrado(5);

        System.out.println("Área do quadrado 1: " + q1.area());
        System.out.println("Comprimento do quadrado 1: " + q1.comprimento());
        System.out.println("Desenho do quadrado 1:");
        q1.desenhoQuadrado();

        System.out.println("Área do quadrado 2: " + q2.area());
        System.out.println("Comprimento do quadrado 2: " + q2.comprimento());
        System.out.println("Desenho do quadrado 2:");
        q2.desenhoQuadrado();
    }
}
