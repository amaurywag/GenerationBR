package for_;
import java.util.Scanner;

public class exercicio_2_for {
	
	public static void main(String[] args) {
		 /* Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.(FOR) */
		int num, resto=0, p=0, i=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int x=0;x<10;x++) {
			System.out.println("Digite o n�mero: ");
			num = leia.nextInt();
			resto = num%2;
			if(resto==0) {
				p+=1;
			}
			else {
				i+=1;
			}
		}
		System.out.println("Voc� t�m "+p+" n�meros pares");
		System.out.println("e "+i+" n�meros �mpares.");
	}
}
