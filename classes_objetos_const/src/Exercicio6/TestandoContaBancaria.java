package Exercicio6;

public class TestandoContaBancaria {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria("Amaury",2.000,2.345);
		ContaBancaria conta2 = new ContaBancaria("Cláudia",7.333,16.995);
		ContaBancaria conta3 = new ContaBancaria("José",7.090,1.345);
		
		conta1.SomaContas();
		conta1.Escreva();
		conta2.SomaContas();
		conta2.Escreva();
		conta3.SomaContas();
		conta3.Escreva();
		
	}
	

}
