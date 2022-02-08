package for_;

import java.util.Scanner;

public class exercicio_6_do_while {

	public static void main(String[] args) {
		/* Escrever um programa que receba vários números inteiros no teclado. E no 
		 * final imprimir a média dos números múltiplos de 3. Para sair digitar 0 (zero). (DO...WHILE)
		 */
		
		int num, resto, media, soma=0, quant=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.print("Digite o número: ");
			num = leia.nextInt();
			resto = num%3;
			if(resto==0 && num>0) {
				quant+=1;
				soma+=num;
				}
		}
		while(num!=0);
		media = soma/quant;
		System.out.println("A média da soma dos números múltiplos de 3 é: "+media);

		
	}
}
