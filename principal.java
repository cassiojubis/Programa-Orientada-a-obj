public class principal {
    /*
     * criar a classe quadrado, com atributos: area e perimetro.
     * Metodos: calcularArea, calcularPerimetro
     */

    public static void main(String[] args) {
                        // Criando um quadrado com lado 4

                        
        quadrado q1 = new quadrado(4);
        q1.calcularArea();
        q1.calcularPerimetro();
        q1.imprimir();

        System.out.println();

        // Criando um quadrado com lado 10
        quadrado q2 = new quadrado(10);
        q2.calcularArea();
        q2.calcularPerimetro();
        q2.imprimir();
        
        System.out.println();

        // Demonstrando outras formas
        retangulo r = new retangulo(5, 3); // base 5, altura 3
        r.calcularArea();
        r.calcularPerimetro();
        r.imprimir();

        System.out.println();

        // Triângulo com lados 3,4,5 (retângulo clássico)
        triangulo t = new triangulo(3, 4, 5);
        t.calcularArea();
        t.calcularPerimetro();
        t.imprimir();

        System.out.println();

        // Círculo com raio 2.5
        circulo c = new circulo(2.5);
        c.calcularArea();
        c.calcularPerimetro();
        c.imprimir();
    }

}

	 /*"criar a classe quaadrado, com atributos: area e perimetro.
     Metodos:calcular Area, Calcular perimetro" */
      
    
