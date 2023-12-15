package treinamentoLacoCondicional;

import java.util.Scanner;

public class ParesImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		int num, verificacao;
		
		System.out.println("Digite um número: ");
		num = leia.nextInt();
		
		verificacao = num%2;
		
		if (verificacao == 0){
		System.out.println("O número "+num+ " é positivo!"); 
		} else {
			System.out.println("O número "+num+ " é negativo!");
		}
	
	}

}
