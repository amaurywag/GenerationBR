package for_;

import java.util.Scanner;

public class exercicio_5_do_while {

	public static void main(String[] args) {
		/* Crie um programa que leia um n�mero do teclado at� que encontre um
		 * n�mero igual a zero. No final, mostre a soma dos n�meros digitados. (SO...WHILE)
		 */
		
		int num, soma=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.print("Digite o n�mero: ");
			num = leia.nextInt();
			soma += num;
			
		}
		while(num!=0);
		System.out.print("O valor da soma dos n�meros digitados �: "+soma);
		
	}

}
