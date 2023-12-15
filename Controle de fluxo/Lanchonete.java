package treinamentoLacoCondicional;

import java.util.Scanner;

public class Lanchonete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		int produto, quantidade, soma;
		
		System.out.println("-----CARDÁPIO----- \n 1 - Cachorro Quente \n 2 - X-Salada \n 3 - X-Bacon"
				+ "\n 4 - Bauru \n 5 - Refrigerante \n 6 - Suco de laranja");
		
		System.out.println("Digite o código do produto: ");
		produto = leia.nextInt();
		
		System.out.println("Digite a quantidade: ");
		quantidade = leia.nextInt();
		
		switch (produto) {
		case 1 :
			System.out.println("Produto: Cachorro Quente");
			System.out.println("Valor total da sua compra é: " +quantidade * 10);
			break;
		case 2 :
			System.out.println("Produto: X-Salada");
			System.out.println("Valor total da sua compra é: " +quantidade * 15);
			break;	
		case 3 :
			System.out.println("Produto: X-Bacon");
			System.out.println("Valor total da sua compra é: " +quantidade * 18);
			break;
		case 4 :
			System.out.println("Produto: Bauru");
			System.out.println("Valor total da sua compra é: " +quantidade * 12);
			break;
		case 5 :
			System.out.println("Produto: Refrigerante");
			System.out.println("Valor total da sua compra é: " +quantidade * 8);
			break;
		case 6 :
			System.out.println("Produto: Suco de laranja");
			System.out.println("Valor total da sua compra é: " +quantidade * 13);
			break;
		default:
			System.out.println("Opção invalida");
		}
		
		
		

	}

}
