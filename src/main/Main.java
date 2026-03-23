package main;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ListaSimplesmenteEncadeada lista = new ListaSimplesmenteEncadeada();
		System.out.println("Digite o primeiro valor do seu nó: ");
		int valor = scanner.nextInt();
		int escolha = 1;
		lista.inserir(valor);
		
		do {
			menu();
			escolha = scanner.nextInt();
			valor = 0;
			switch (escolha) {
			case 1: 
				System.out.println("Digite o valor que deseja inserir no seu nó: ");
				valor = scanner.nextInt();
				lista.inserir(valor);
				break;
			case 2:
				System.out.println("Digite o valor que você deseja buscar no seu nó: ");
				valor = scanner.nextInt();
				lista.buscar(valor);
				break;
			case 3:
				System.out.println("Digite o valor que você deseja remover da sua lista:");
				valor = scanner.nextInt();
				break;
			case 4: 
				lista.imprimir();
				break;
			case 5:
				System.out.println("Removendo repeticoes");
				lista.removerRepeticao();
			}
			
		} while(escolha != 0);
		
		scanner.close();
	}

	public static void menu() {
		System.out.println("\n -----------------------");
		System.out.println("          Menu             ");
		System.out.println("Voce deseja inserir,|1| buscar |2|, remover |3|, imprimir |4|, remover repetições |5|  ou sair |0|? ");
		System.out.println(" ----------------------- \n");

	}

}
