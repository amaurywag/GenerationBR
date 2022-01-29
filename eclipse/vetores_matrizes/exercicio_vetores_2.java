package vetores;

import java.util.Scanner;

public class exercicio_vetores_2 {

	public static void main(String[] args) {
		/*Faça um programa que receba 6 números inteiros e mostre: OK
		(a) Os números pares digitados;  
		(b) A soma dos números pares digitados; 
		(c) Os números ímpares digitados; 
		(d) A quantidade de números ímpares digitados.*/

		int[] n = new int[6];
		int y, somaP=0, cont = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um primeiro número: ");
		n[0] = leia.nextInt();
		System.out.print("Digite um segundo número: ");
		n[1] = leia.nextInt();
		System.out.print("Digite um terceiro número: ");
		n[2] = leia.nextInt();
		System.out.print("Digite um quarto número: ");
		n[3] = leia.nextInt();
		System.out.print("Digite um quinto número: ");
		n[4] = leia.nextInt();
		System.out.print("Digite um sexto número: ");
		n[5] = leia.nextInt();
		
		System.out.print("\n");
		
		for(int x=0;x<6;x++){
			y = n[x] % 2;
			if(y==0){
				somaP += n[x];
				System.out.println("Número par digitado: "+n[x]);
			}
		}
		System.out.println("A soma de todos os números pares é: "+somaP);

		System.out.print("\n");

		for(int i=0;i<6;i++) {
			y = n[i] % 2;
			if(y!=0) {
				cont += 1;
				System.out.println("Número impar digitado: "+n[i]);
			}	
		}
		System.out.println("Você digitou "+cont+" número/s ímpares");
	}
}
