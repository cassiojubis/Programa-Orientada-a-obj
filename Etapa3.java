package Numero;

import java.util.Scanner;

public class Etapa3 {

    // atributos da classe
    String cliente;
    String descricao;
    double valorH;
    double horas;

    // construtor
    public Etapa3(String cliente, String descricao, double valorH, double horas){
        this.cliente = cliente;
        this.descricao = descricao;
        this.valorH = valorH;
        this.horas = horas;
    }

    // metodo para calcular o total
    public double calculoTotal(){
        return valorH * horas;
    }

    // metodo para exibir o resumo
    public void exibirResumo(){

        System.out.println("\n==============================");
        System.out.println("      RESUMO DA ORDEM");
        System.out.println("==============================");

        System.out.println("Cliente: " + cliente);
        System.out.println("Problema: " + descricao);
        System.out.println("Valor da hora: " + valorH);
        System.out.println("Horas trabalhadas: " + horas);
        System.out.println("Total a pagar: " + calculoTotal());

        System.out.println("==============================");
    }

    public static void main(String[] args) {

        Scanner leitorT = new Scanner(System.in);

        // leitura dos dados
        System.out.print("Digite o nome do cliente: ");
        String cliente = leitorT.nextLine();

        System.out.print("Descreva o problema: ");
        String descricao = leitorT.nextLine();

        System.out.print("Valor da hora de serviço: ");
        double valorH = leitorT.nextDouble();

        System.out.print("Quantidade de horas trabalhadas: ");
        double horas = leitorT.nextDouble();

        // criando o objeto
        Etapa3 ordem = new Etapa3(cliente, descricao, valorH, horas);

        // exibindo o resumo
        ordem.exibirResumo();

        leitorT.close();
    }
}
