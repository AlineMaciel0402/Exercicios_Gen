package Exercicios11;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vetorInteiros [] = {2,5,1,3,4,9,7,8,10,6};
		int num;
		Scanner leia = new Scanner (System.in);
			
		System.out.println("Digite o número que você deseja encontrar: ");
		num = leia.nextInt();
		
		for( int indiceLinhas = 0; indiceLinhas <vetorInteiros.length; indiceLinhas++) {
			if (vetorInteiros[indiceLinhas] == num) 
				System.out.println("A posição é: " +indiceLinhas);
	
				
		
		
	
		}
				
		
			}

		}
		



