package Exercicio5;

public class TestandoPatinete {

	public static void main(String[] args) {
		Patinete patinete1 = new Patinete(1.200);
		Patinete patinete2 = new Patinete(3.000);
		Patinete patinete3 = new Patinete(5.000);
		
		patinete1.PegaModelo();
		patinete1.PegaRodas();
		patinete1.Escreva();
		
		patinete2.PegaModelo();
		patinete2.PegaRodas();
		patinete2.Escreva();
		
		patinete3.PegaModelo();
		patinete3.PegaRodas();
		patinete3.Escreva();

	}

}
