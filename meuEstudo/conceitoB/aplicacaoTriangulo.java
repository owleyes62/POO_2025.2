public class aplicacaoTriangulo {
    public static void main(String[] args) {
        trianguloRetangulo t1 = new trianguloRetangulo();
        trianguloRetangulo t2 = new trianguloRetangulo(5, 12);

        System.out.println("Área do triângulo 1: " + t1.area());
        System.out.println("Comprimento do triângulo 1: " + t1.comprimento());

        System.out.println("Área do triângulo 2: " + t2.area());
        System.out.println("Comprimento do triângulo 2: " + t2.comprimento());
    }
}
