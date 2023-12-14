package estruturaDeDados;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> fila = new LinkedList<String>();
        Scanner leia = new Scanner(System.in);
        int opcao;
        int contador = 0;
        String cliente;
        
        System.out.println("\n===== MENU =====\n1 - Adicionar novo Cliente na fila \n"
        		+ "2 - Listar todos os Clientes na fila \n3 - Retirar cliente da fila \n0 - Sair");
        
        while (contador ==0){
        	System.out.println("Escolha uma opção:");
        	 opcao = leia.nextInt();
   
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do Cliente a ser adicionado:");
                    cliente = leia.next();
                    fila.add(cliente);
                    System.out.println("\nFila: "+ fila );
                    System.out.println("\nCliente adicionado!");
                    break;
                case 2:
                	System.out.println(fila);
                    break;
                case 3:
                	System.out.println("O cliente: " +fila.poll()+ "foi chamado!");
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    contador++;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");

                    
            }
	}

	}
}

