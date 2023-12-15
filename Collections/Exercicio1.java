package Aula12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		ArrayList <String> cores = new ArrayList<String>();
		String cores2;
		
		for(int contador = 0; contador <5; contador++) {
			System.out.println("Digite uma cor:");
			cores2 = leia.nextLine();
			cores.add(cores2);
		}
		System.out.println("\nListar todas as cores");
		for(String lista : cores) {
			System.out.println(lista);
		}
		
		Collections.sort(cores);
		
		System.out.println("\nOrdenador as cores:");
		
		for(String lista : cores ) {
			System.out.println(lista);	
			

		
		
		}
	}
}

