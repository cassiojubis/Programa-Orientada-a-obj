package oskay;

public class principal {
	 /*"criar a classe quaadrado, com atributos: area e perimetro.
     Metodos:calcular Area, Calcular perimetro" */

     public static void main(String[] args) {
        quadrado q1 = new quadrado(lado:4);
        q1.calcularArea();
        q1.calcularPerimetro();
        q1.imprimir();

        quadrado q2 = new quadrado(10);
        q2.calcularArea();
        q2.calcularPerimetro();
        q2.imprimir();
}
