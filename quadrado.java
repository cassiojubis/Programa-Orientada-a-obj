
public class quadrado {
	// todas classe tera atributos e metodos
    //Atributos são as caracteristicas (variaveis)
    //Metodos são as ações (funções)
    //CLassificamos esse metodos de acordo com as suas caracteristicas:
    //Metodo contrutor:  quando for instaciado um novo objeto, ele sera 'construido'conforme definido no metodo construtor
    //Metodo get: retorna o valor do atributo
    //Metodo set: define o valor do atributo
    //get(pegar) -> utilizado para ver qual o valor atual do atributo
    // set (colocar) -> insere/altera o valor do atributo 
    //metodos 'proprios': metodos que criamos para dar mais ações para a nossa classe

    //atributos da classe quadrado:
    double lado;
    double area;
    double perimetro;

    //métodos 
    //métodos construtor:
    public quadrado(double lado) {
        this.lado = lado;
        
    }

    public void calcularArea(){
        this.area = this.lado * this.lado;       
    }
     public void calcularPerimetro(){
        this.perimetro = this.lado * 4;
     }
     public void imprimir(){
        System.out.println("lado: " + this.lado);
        System.out.println("area: " + this.area);
        System.out.println("perimetro: " + this.perimetro);
     }
}