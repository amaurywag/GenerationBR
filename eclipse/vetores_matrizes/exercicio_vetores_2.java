package vetores;

import java.util.Scanner;

public class exercicio_vetores_2 {

	public static void main(String[] args) {
		/*Fa�a um programa que receba 6 n�meros inteiros e mostre: OK
		(a) Os n�meros pares digitados;  
		(b) A soma dos n�meros pares digitados; 
		(c) Os n�meros �mpares digitados; 
		(d) A quantidade de n�meros �mpares digitados.*/

		int[] n = new int[6];
		int y, somaP=0, cont = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um primeiro n�mero: ");
		n[0] = leia.nextInt();
		System.out.print("Digite um segundo n�mero: ");
		n[1] = leia.nextInt();
		System.out.print("Digite um terceiro n�mero: ");
		n[2] = leia.nextInt();
		System.out.print("Digite um quarto n�mero: ");
		n[3] = leia.nextInt();
		System.out.print("Digite um quinto n�mero: ");
		n[4] = leia.nextInt();
		System.out.print("Digite um sexto n�mero: ");
		n[5] = leia.nextInt();
		
		System.out.print("\n");
		
		for(int x=0;x<6;x++){
			y = n[x] % 2;
			if(y==0){
				somaP += n[x];
				System.out.println("N�mero par digitado: "+n[x]);
			}
		}
		System.out.println("A soma de todos os n�meros pares �: "+somaP);

		System.out.print("\n");

		for(int i=0;i<6;i++) {
			y = n[i] % 2;
			if(y!=0) {
				cont += 1;
				System.out.println("N�mero impar digitado: "+n[i]);
			}	
		}
		System.out.println("Voc� digitou "+cont+" n�mero/s �mpares");
	}
}
