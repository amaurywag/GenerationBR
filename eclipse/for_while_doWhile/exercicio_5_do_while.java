package for_;

import java.util.Scanner;

public class exercicio_5_do_while {

	public static void main(String[] args) {
		/* Crie um programa que leia um número do teclado até que encontre um
		 * número igual a zero. No final, mostre a soma dos números digitados. (SO...WHILE)
		 */
		
		int num, soma=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.print("Digite o número: ");
			num = leia.nextInt();
			soma += num;
			
		}
		while(num!=0);
		System.out.print("O valor da soma dos números digitados é: "+soma);
		
	}

}
