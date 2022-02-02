package for_;
import java.util.Scanner;

public class exercicio_2_for {
	
	public static void main(String[] args) {
		 /* Ler 10 números e imprimir quantos são pares e quantos são ímpares.(FOR) */
		int num, resto=0, p=0, i=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int x=0;x<10;x++) {
			System.out.println("Digite o número: ");
			num = leia.nextInt();
			resto = num%2;
			if(resto==0) {
				p+=1;
			}
			else {
				i+=1;
			}
		}
		System.out.println("Você têm "+p+" números pares");
		System.out.println("e "+i+" números ímpares.");
	}
}
