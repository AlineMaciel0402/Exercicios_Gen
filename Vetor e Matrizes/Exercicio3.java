package Exercicios11;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matrizInteiros [] [] = new int [3] [3];
		Scanner leia = new Scanner (System.in);
		
		for (int linha = 0; linha <3; linha++) {
			for (int coluna = 0; coluna <3; coluna++) {
				System.out.println("Digite um número para a posição [ " + linha + " ] [" + coluna + "]: ");
				matrizInteiros [linha][coluna] = leia.nextInt();
			}
			}	
		 System.out.println("Elementos da Diagonal Principal:");
	        for (int i = 0; i < 3; i++) {
	            System.out.print(matrizInteiros[i][i] + " ");    
	        }
	        System.out.println("\nElementos da Diagonal Secundária:");
	        for (int i = 0; i < 3; i++) {
	            System.out.print(matrizInteiros[i][2 - i] + " ");
	        }
	        System.out.println();

	        int somaDiagonalPrincipal = 0;
	        int somaDiagonalSecundaria = 0;
		
	        for (int i = 0; i < 3; i++) {
	            somaDiagonalPrincipal += matrizInteiros[i][i];
	            somaDiagonalSecundaria += matrizInteiros[i][2 - i];
	        }       
	        System.out.println("Soma dos elementos da Diagonal Principal: " + somaDiagonalPrincipal);
	        System.out.println("Soma dos elementos da Diagonal Secundária: " + somaDiagonalSecundaria);
		
	
			
	}

}


