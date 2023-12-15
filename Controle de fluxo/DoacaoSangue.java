package treinamentoLacoCondicional;

import java.util.Scanner;

public class DoacaoSangue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Você já é doador? (true/false)");
		primeiraDoacao = leia.nextBoolean();
		
		if (idade >= 18 && idade <= 59) {
		System.out.println(nome+" você esta apto(a) para doar!");
		
		}else if (idade >=60 && idade <=69 && true) {
		System.out.println(nome+" você esta apt(a) para doar");
		
		}else {
			System.out.println(nome+" você não esta apto(a) para doar!");
		}
		
		
		
		
		
		
		

	}

}
