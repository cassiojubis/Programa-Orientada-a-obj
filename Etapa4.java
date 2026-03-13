package Numero;

import java.util.Scanner;

public class Etapa4 {

	String cliente;
	String descricao;
	double valorH;
	double horas;
	String status;

	public Etapa4(String cliente, String descricao, double valorH, double horas) {
		this.cliente = cliente;
		this.descricao = descricao;
		this.valorH = valorH;
		this.horas = horas;
		this.status = "aberta";
	}

	public double calculoTotal() {
		return valorH * horas;
	}

	public void atualizarHoras(double novasHoras) {
		if (novasHoras >= 0) {
			this.horas = novasHoras;
		}
	}

	// atualizar valor
	public void atualizarValorHora(double novoValor) {
		if (novoValor >= 0) {
			this.valorH = novoValor;
		}
	}
	
	//atualizar status
	public void alterarStatus(String novoStatus){
	    this.status = novoStatus;
	}
	public void exibirResumo() {

		System.out.println("\n==============================");
		System.out.println("      RESUMO DA ORDEM");
		System.out.println("==============================");

		System.out.println("Cliente: " + cliente);
		System.out.println("Problema: " + descricao);
		System.out.println("Status: " + status);
		System.out.println("Valor da hora: " + valorH);
		System.out.println("Horas trabalhadas: " + horas);
		System.out.println("Total a pagar: " + calculoTotal());

		System.out.println("==============================");
	}

	public static void main(String[] args) {

        Scanner leitorT = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String cliente = leitorT.nextLine();

        System.out.print("Descreva o problema: ");
        String descricao = leitorT.nextLine();

        System.out.print("Valor da hora de serviço: ");
        double valorH = leitorT.nextDouble();

        System.out.print("Quantidade de horas trabalhadas: ");
        double horas = leitorT.nextDouble();

        Etapa4 ordem = new Etapa4(cliente, descricao, valorH, horas);
        
        int opcao;
        do {
        	 System.out.println("\n===== MENU =====");
             System.out.println("1 - Alterar status");
             System.out.println("2 - Atualizar horas");
             System.out.println("3 - Atualizar valor da hora");
             System.out.println("4 - Ver resumo");
             System.out.println("5 - Sair");
             System.out.print("Escolha: ");
             
             opcao = leitorT.nextInt();
             	
             leitorT.nextLine();
          switch(opcao) {
          
          case 1:
        	  
        	  System.out.print("Novo status: ");
              String novoStatus = leitorT.nextLine();
              ordem.alterarStatus(novoStatus);
              break;
           
          case 2:
        	   System.out.println("Nova horas: ");
        	  double  novasHoras = leitorT.nextDouble();
        	  ordem.atualizarHoras(novasHoras);
        	  break;
          case 3:
        	  System.out.println(" Novo valor da hora: ");
        	  double novoValor =leitorT.nextDouble();
        	  ordem.atualizarValorHora(novoValor);
        	  break;
          case 4:
        	  ordem.exibirResumo();
        	  break;
          case 5: 
        	  System.out.println(" Saindo do sistema...");
        	  break;
        	
         default :
        	 System.out.println("opção invalida");
          } 
       
        } while(opcao != 5); 	
    		
        
    }
}
