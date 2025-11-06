public class triangulo {
     double a;
    double b;
    double c;
    double area;
    double perimetro;

    public triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calcularArea() {
        double s = (a + b + c) / 2.0;
        this.area = Math.sqrt(Math.max(0.0, s * (s - a) * (s - b) * (s - c)));
    }

    public void calcularPerimetro() {
        this.perimetro = a + b + c;
    }

    public void imprimir() {
        System.out.println("Triângulo - lados: " + a + ", " + b + ", " + c);
        System.out.println("Área: " + this.area);
        System.out.println("Perímetro: " + this.perimetro);
    }
}
