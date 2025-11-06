public class retangulo {
     double base;
    double altura;
    double area;
    double perimetro;

    public retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea() {
        this.area = this.base * this.altura;
    }

    public void calcularPerimetro() {
        this.perimetro = 2 * (this.base + this.altura);
    }

    public void imprimir() {
        System.out.println("Retângulo - base: " + this.base + ", altura: " + this.altura);
        System.out.println("Área: " + this.area);
        System.out.println("Perímetro: " + this.perimetro);
    }
}
