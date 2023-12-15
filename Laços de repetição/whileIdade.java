package treinamentoLacoRepeticao;

import java.util.Scanner;

public class whileIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		int idade, menor =0, maior =0;
	
			System.out.println("Digite uma idade: (Para encerrar digite uma idade negativa)");

			do {
	            System.out.println("Idade: ");
	            idade = leia.nextInt();
	            
	            if (idade >= 0) {
	                if (idade < 21) {
	                    menor++;
	                } else if (idade > 50) {
	                    maior++;
	                }
	            }
	        } while (idade >= 0);
	        
	        System.out.println("Total de pessoas menores de 21 anos: " + menor);
	        System.out.println("Total de pessoas maiores de 50 anos: " + maior);				

	}
}


