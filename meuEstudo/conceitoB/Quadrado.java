public class Quadrado {
    int lado;

    public Quadrado() {
        this.lado = 2;
    }

    public Quadrado(int lado) {
        this.lado = lado;
    }

    double area(){
        return this.lado * this.lado;
    }

    double comprimento(){
        return 4 * this.lado;
    }

    void desenhoQuadrado(){
        for (int i = 0; i < this.lado; i++) {
            for (int j = 0; j < this.lado; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
