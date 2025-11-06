public class circulo {
    double raio;
    double area;
    double perimetro;

    public circulo(double raio) {
        this.raio = raio;
    }

    public void calcularArea() {
        this.area = Math.PI * this.raio * this.raio;
    }

    public void calcularPerimetro() {
        this.perimetro = 2 * Math.PI * this.raio;
    }

    public void imprimir() {
        System.out.println("Círculo - raio: " + this.raio);
        System.out.println("Área: " + this.area);
        System.out.println("Perímetro: " + this.perimetro);
    }
}
