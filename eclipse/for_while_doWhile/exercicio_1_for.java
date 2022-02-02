package for_;

public class exercicio_1_for {

	public static void main(String[] args) {
		 /*Informar todos os números de 1000 a 1999 que quando
		  * divididos por 11 obtemos resto = 5 (FOR)
		  */
		int x,resto=0;
		
		for(x=1000;x<2000;x++) {
			resto = x%11;
			if(resto==5) {
				System.out.printf("\nO número divido por 11 que sofra resto de 5: %d",x);
			}
		}
	}

}
