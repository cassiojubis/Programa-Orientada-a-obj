import java.util.Scanner;

public class principal {
    /*
     * criar a classe quadrado, com atributos: area e perimetro.
     * Metodos: calcularArea, calcularPerimetro
     */


    
    public static void main(String[] args) {
                        // Criando um quadrado com lado 4
        Scanner sc = new Scanner(System.in);
        int opcao;

            //menu feito para que o usuario escolha uma forma geometrica 
        System.out.println("=== MENU DE FORMAS GEOMÉTRICAS ===");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Retângulo");
        System.out.println("3 - Triângulo");
        System.out.println("4 - Círculo");
        System.out.print("Escolha uma opção: ");
        opcao = sc.nextInt();
                                //switch feito para caso o  usuario escolha alguma forma,  
                                //exemplo: se ele escolhe a 1  vai ativar  o case 1 e entrara,se ele n escolhe  nenhuma que esta no menu, da invalido.
        switch (opcao) {        
            case 1:
                    System.out.println("informe o lado do quadrado");
                    double lado = sc.nextDouble();
        
                    quadrado q1 = new quadrado(lado);
                    q1.calcularArea();
                    q1.calcularPerimetro();
                    q1.imprimir();
                     
                break;
      
            case 2: 
                System.out.println("informe a base do retangulo");
                    double base = sc.nextDouble();
                System.out.println(" informe a altura  ");
                    double altura = sc.nextDouble();
                    retangulo r =new retangulo(base, altura);
                    r.calcularArea();
                    r.calcularPerimetro();
                    r.imprimir();
                break;

            case 3: 
                System.out.println("informe o lado a");
                double a = sc.nextDouble();
                System.out.println("informe o lado b");
                double b = sc.nextDouble();
                System.out.println("informe o lado c");
                double c = sc.nextDouble();

                     triangulo t = new triangulo(a,b,c);
                     t.calcularArea();
                     t.calcularPerimetro();
                     t.imprimir();
                  break;      
      
            case 4:
             System.out.println("informe o raio do circulo");
                double raio = sc.nextDouble();
        // Círculo com raio 2.5
                     circulo circ = new circulo(raio);
                      circ.calcularArea();
                     circ.calcularPerimetro();
                      circ.imprimir();
                      break;
                      default:
                      System.out.println("opção invalida");
    }

}
}
	 /*"criar a classe quaadrado, com atributos: area e perimetro.
     Metodos:calcular Area, Calcular perimetro" */
      
    
