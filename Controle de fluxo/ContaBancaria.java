package treinamentoLacoCondicional;

import java.util.Scanner;

public class ContaBancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		int operacao;
		float saldo = 1000, saque,novoSaldo, deposito;
		
		System.out.println("Digite a operação desejada: \n 1- Saldo \n 2 - Saque \n 3 - Depósito");
		operacao = leia.nextInt();
		
		switch (operacao) {
		case 1:
			System.out.println("Seu saldo é de R$"+saldo);
		break;
		case 2:
			System.out.println("Qual valor deseja sacar?");
			saque = leia.nextFloat();
			if (saque <= saldo) {
			System.out.println("Saque de R$"+saque+" efetuado com sucesso.");
			novoSaldo = saldo - saque;
			System.out.println("Seu novo saldo é de R$"+novoSaldo);
			}else {
				System.out.println("Saldo insuficiente!");	
			}
		break;
		case 3:
			System.out.println("Qual valor deseja depositar?");
			deposito = leia.nextFloat();
			System.out.println("Depósito de R$"+deposito+" efetuado com sucesso!");
			novoSaldo = saldo + deposito;
			System.out.println("Seu novo saldo é de R$"+novoSaldo);
		break;
		default:
			System.out.println("Operação inválida!");
		
			
			
			
		}
		

	}

}
