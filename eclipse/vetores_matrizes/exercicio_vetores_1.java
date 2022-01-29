package vetores;

public class exerciocio_vetores_1 {

	public static void main(String[] args) {
		/*Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
		(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
		(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
		(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
		(d) Mostre na tela cada valor do vetor A, um em cada linha. */

		int [] a = new int[6]; //(a)
		int x = 0;
		
		a[0] = 1;
		a[1] = 0;
		a[2] = 5;
		a[3] = -2;
		a[4] = -5;
		a[5] = 7;
		
		x = a[0]+a[1]+a[5];
		System.out.println("A soma dos valores de "+a[0]+" + "+a[1]+" + "+a[5]+" = "+x); //(b)
		
		a[4] = 100; //(c)
		
		//(d)
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);
		
	}

}
