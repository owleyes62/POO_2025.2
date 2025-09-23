public class trianguloRetangulo {
    int base;
    int altura;
    double hipotenusa;

    public trianguloRetangulo() {
        this.base = 3;
        this.altura = 4;
        this.hipotenusa = Math.sqrt(base * base + altura * altura);
    }

    public trianguloRetangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        this.hipotenusa = Math.sqrt(base * base + altura * altura);
    }

    double area() {
        return 0.5 * this.base * this.altura;
    }

    double comprimento() {
        return this.base + this.altura + this.hipotenusa;
    }
}
