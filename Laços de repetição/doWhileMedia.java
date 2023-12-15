package treinamentoLacoRepeticao;

import java.util.Scanner;

public class doWhileMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		int num, soma = 0, contador = 0;
		
		System.out.println("Digite um número: (Para finalizar digite 0)");
		
		do {
			System.out.println("Número:");
			num = leia.nextInt();
			
			if (num != 0 && num % 3 == 0) {
				soma += num;
				contador++;
			}
			
		}while (num !=0);
		
		if(contador > 0) {
			double media =(double) soma / contador;
			System.out.println("A média dos números múltiplos de 3 é : "+media);
		}else {
			System.out.println("Nenhum número multiplo de 3 foi digitado!");
			
			
			
		
	
		}
	}
}

