package treinamentoLacoCondicional;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		float num1, num2, resultado;
		int codigo;
		
		System.out.println("Insira um número: ");
		num1 = leia.nextFloat();
		
		System.out.println("Insira outro número: ");
		num2 = leia.nextFloat();
		
		System.out.println("1 - Soma \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão \n Escolha a operação: ");
		codigo = leia.nextInt();
		
		switch(codigo) {
		case 1:
			resultado = num1 + num2;
			System.out.println("O resultado da sua soma é: "+resultado);
		break;
		case 2:
			resultado = num1 - num2;
			System.out.println("O resultado da sua subtração é: "+resultado);
		break;
		case 3:
			resultado = num1 * num2;
			System.out.println("O resultado da sua multiplicação é: "+resultado);
		break;
		case 4:
			resultado = num1 / num2;
			System.out.println("O resultado da sua divisão é: "+resultado);
		break;
		default:
			System.out.println("Operação inválida!");
		
		}
				

	}

}
