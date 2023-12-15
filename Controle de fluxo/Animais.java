package treinamentoLacoCondicional;

import java.util.Scanner;

public class Animais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		String palavra1, palavra2, palavra3;
		
		System.out.println("Digite a primeira palavra: ");
		palavra1 = leia.next();
		
		System.out.println("Digite a segunda palavra: ");
		palavra2 = leia.next();
		
		System.out.println("Digite a terceira palavra: ");
		palavra3 = leia.next();
		
		if(palavra1.equals("vertebrado")) {
			if(palavra2.equals("ave")) {
				if(palavra3.equals("carnivoro")) {
					System.out.println("Águia");
				}else {
					System.out.println("Pomba");
				}
			}else {
				if (palavra2.equals("onivoro")) {
					System.out.println("Homem");
					}else {
						System.out.println("Vaca");
					}
					
				}
				
			}else {
				if(palavra2.equals("inseto")) {
					if(palavra3.equals("hematofogo")){
					System.out.println("Pulga");
				}else {
					System.out.println("Lagarta");
				}
		}else {
			if(palavra3.equals("hematofogo")) {
				System.out.println("Sansessuga");
			}else {
				System.out.println("Minhoca");
			}
		}
		

	}
	}
}

