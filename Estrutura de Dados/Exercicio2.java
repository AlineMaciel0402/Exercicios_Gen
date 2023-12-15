package estruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		Stack<String> pilhaLivros = new Stack<String>();
		int operacao = 1;
		
		System.out.println("1 - Adicionar um novo livro na pilha \n2 - Listar todos os livros da Pilha"
				+ "\n3 - Retirar um livro da pilha \n0 - O programa deve ser finalizado");

		do {
			System.out.print("\nEscolha uma opção: ");
			operacao = leia.nextInt();
			
			switch(operacao) {
			case 1:

				System.out.print("\nDigite o nome do cliente: ");
				leia.nextLine();
				pilhaLivros.push(leia.nextLine());
			
				System.out.println("\nPilha:\n");
				for(String pilha: pilhaLivros) {
					System.out.println(pilha);
				}
				
				System.out.println("\nLivro adicionado! \n");

				break;
			case 2:
				
				System.out.println("\nPilha:\n");
				
				for(String pilha: pilhaLivros) {
					System.out.println(pilha);
				}
				
				break;
			case 3:
				
				if(!pilhaLivros.isEmpty()) {
					pilhaLivros.pop();
					
					System.out.println("\nPilha:\n");	
					
				    for(String pilha: pilhaLivros) {
						System.out.println(pilha);
					}
				    
				    System.out.println("\nUm livro foi retirado da pilha! \n");
				} else {
					System.out.println("\nA Fila está vazia!\n");
				}
				
				break; 
			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;
			}
			
		} while(operacao != 0);
		
		leia.close();
	}
}