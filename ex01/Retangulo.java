public class Retangulo {
    double largura;
    double altura;

    Retangulo(double l, double a) {
        largura = l;
        altura = a;
    }

    double area() {
        return largura * altura;
    }

    double perimetro() {
        return 2 * (largura + altura);
    }
}
