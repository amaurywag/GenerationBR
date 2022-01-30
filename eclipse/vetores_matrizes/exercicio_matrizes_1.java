package matrizes;

import java.util.Scanner;

public class exercicio_matrizes_1 {

	public static void main(String[] args) {
		/* 4. Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
		(1) somar as duas matrizes 
		(2) subtrair a primeira matriz da segunda 
		(3) adicionar uma constante as duas matrizes
		(4) imprimir as matrizes 
		Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o
		valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.*/
		
		float[][] m1 = new float[2][2];
		float[][] m2 = new float[2][2];
		float[][] m3 = new float[2][2];
		
		int l, c, con=0,cont=0;
		float somaM1 = 0, somaM2 = 0, constant;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("--- Populando a matriz 1 ---");
		for(l=0;l<2;l++) {
			for(c=0;c<2;c++) {
				con+=1;
				System.out.print("Digite o número que irá ocupar o "+con+"º espaço da matriz 1: ");
				m1[l][c] = leia.nextFloat();
				somaM1 = somaM1 + m1[l][c];
			}
		}
		System.out.println("\n--- Populando a matriz 2 ---");
		for(l=0;l<2;l++) {
			for(c=0;c<2;c++) {
				cont+=1;
				System.out.print("Digite o número que irá ocupar o "+cont+"º espaço da matriz 2: ");
				m2[l][c] = leia.nextFloat();
				somaM2 = somaM2 + m2[l][c];
			}
			int num;
				do {
		
		System.out.println("\n\t\tEscolha uma das opções abaixo: \n");
		System.out.println("1. Somar as duas matrizes");
		System.out.println("2. Subtrair a 1ª matriz da 2ª matriz");
		System.out.println("3. Adicionar uma constante as duas matrizes");
		System.out.println("4. Imprimir as matrizes");

		float somaM, subM;
		System.out.print("\nDigite o número acima para escolher: ");
		num = leia.nextInt();
		
		switch(num) {
		case 1:
			//somaM = somaM1+somaM2;
			for(l=0;l<2;l++) {
				for(c=0;c<2;c++)
				{
					m3[l][c] = m1[l][c]+m2[l][c];
					System.out.println("\nVocê escolheu a soma das matrizes\nO valor da soma entre elas é: "+m3[l][c]);
				}
			}
			break;
		case 2:
			//subM = somaM1-somaM2;
			for(l=0;l<2;l++) {
				for(c=0;c<2;c++)
				{
					m3[l][c] = m1[l][c]-m2[l][c];
			System.out.println("\nVocê escolheu a subtração entre as matrizes\nO valor da subtração entre elas é: "+m3[l][c]);
				}
			}
			break;
		case 3:
			System.out.println("\nVocê escolheu adicionar uma constante aos valores das duas matrizes");
			System.out.print("Qual o valor que você quer adicionar? Digite aqui: ");
			constant = leia.nextFloat();
			System.out.println("\n--- Valores da matriz 1 com a adição da constante "+constant+" ---");
			cont=0;
			for(l=0;l<2;l++) {
				for(c=0;c<2;c++) {
					m1[l][c] += constant;
					cont+=1;
					System.out.println("O "+cont+"º espaço da matriz vale: "+m1[l][c]);							
				}
			}
			System.out.println("\n--- Valores da matriz 2 com a adição da constante "+constant+" ---");
			cont=0;
			for(l=0;l<2;l++) {
				for(c=0;c<2;c++) {
					m2[l][c] += constant;
					cont+=1;
					System.out.println("O "+cont+"º espaço da matriz vale: "+m2[l][c]);					
				}
			}
			break;
		case 4:
			System.out.println("\nVocê escolheu imprimir as matrizes, seguem elas abaixo:");
			System.out.println("\n--- Valores da matriz 1 ---");
				System.out.println("1º espaço: "+m1[0][0]);
				System.out.println("2º espaço: "+m1[0][1]);
				System.out.println("3º espaço: "+m1[1][0]);
				System.out.println("4º espaço: "+m1[1][1]);
			System.out.println("\n--- Valores da matriz 2 ---");
				System.out.println("1º espaço: "+m2[0][0]);
				System.out.println("2º espaço: "+m2[0][1]);
				System.out.println("3º espaço: "+m2[1][0]);
				System.out.println("4º espaço: "+m2[1][1]);
			break;
		default:
			System.out.println("\nVocê acabou de digitar um número inválido!");
		}
				
				}
				while(num!=0);
		}
		
	}

}
