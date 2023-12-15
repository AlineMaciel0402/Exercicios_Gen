package treinamentoLacoCondicional;

import java.util.Scanner;

public class AjusteSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		String nome;
		int codigo;
		float salario, novoSalario;
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("--CARGOS-- \n 1 - Gerente \n 2 - Vendedor \n 3- Supervisor"
				+ "\n 4  Motorista \n 5 - Estoquista \n Técnico de TI \n Digite o código"
				+ "correspondente ao seu cargo: ");
		codigo = leia.nextInt();
		
		System.out.println("Digite o seu salário: ");
		salario = leia.nextFloat();
		
		
		switch (codigo) {
		case 1:
			novoSalario= salario * 1.1f;
		System.out.println(nome+" você é Gerente e o seu novo salário é :" +novoSalario);
		break;
		case 2:
			novoSalario= salario * 1.07f;
		System.out.println(nome+" você é Vendedor e o seu novo salário é :" +novoSalario);
		break;
		case 3:
			novoSalario= salario * 1.09f;
		System.out.println(nome+" você é Supervisor e o seu novo salário é :" +novoSalario);
		break;
		case 4:
			novoSalario= salario * 1.06f;
		System.out.println(nome+" você é Motorista e o seu novo salário é :" +novoSalario);
		break;
		case 5:
			novoSalario= salario * 1.05f;
		System.out.println(nome+" você é Estoquista e o seu novo salário é :" +novoSalario);
		break;
		case 6:
			novoSalario= salario * 1.08f;
		System.out.println(nome+" você é Técnico de TI e o seu novo salário é :" +novoSalario);
		break;
		default:
		System.out.println("Código inválido!");
		}
		
		

	}

}
