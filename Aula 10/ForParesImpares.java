package treinamentoLacoRepeticao;

import java.util.Scanner;

public class ForParesImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		int num = 0, numRes;
		
		for(int n=1; n<=10; n++) {
			System.out.println("Digite o "+n+"º número:");
			num = leia.nextInt();	
		}
		numRes = num%2;
		
			if(numRes == 0) {
			System.out.println(numRes+" números pares!");
			}else {
				System.out.println(numRes+ " números ímpares!");
				
			}
					

	}
}

	


