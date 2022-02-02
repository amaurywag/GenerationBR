
package for_;

import java.util.Scanner;

public class exercicio_3_while {

	public static void main(String[] args) {
		/* Solicitar a idade de várias pessoas e imprimir:
		 * Total de pessoas com menos de 21 anos. Total de pessoas mais de 50 anos.
		 * O programa termina quando idade for = -99. (WHILE)
		 */
		
		int idade,me = 0, ma = 0;
		
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite a idade: ");
		idade = leia.nextInt();
		
		while(idade!=-99) {
			if(idade<21) {
				me +=1;
				System.out.print("Menor que 25 anos\n");
			}
			else if(idade>50){
				ma +=1;
				System.out.print("Maior que 50 anos\n");
			}
			else {
				System.out.print("Indiferente!\n");
			}
			System.out.print("Digite a idade: ");
			idade = leia.nextInt();
		}
		System.out.println("Menos que 21: "+me);
		System.out.println("Mais que 50: "+ma);
	}

}
