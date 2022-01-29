package vetores;

import java.util.Scanner;

public class exercicio_matrizes_2 {

	public static void main(String[] args) {
		// Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui

		int[][] mat = new int[3][3];
		int l, c, cont=0, con=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(l=0;l<3;l++) {
			for(c=0;c<3;c++) {
				con+=1;
				System.out.print("Digite o "+con+"º número: ");
				mat[l][c] = leia.nextInt();
				int x = 0;
					x+=mat[l][c];
				if(x>9) {
					cont +=1;
				}
			}
		}
		System.out.println("\n\t\t\tResultado:");
		System.out.println("\nTiveram "+cont+" números acima de 10");

	}

}
