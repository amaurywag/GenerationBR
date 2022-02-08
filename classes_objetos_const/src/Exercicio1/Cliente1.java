package Exercicio1;
	
	//1. Cliando a classe cliente
	//qualificador de acessos (public) + class + nome da class (Cliente):
public class Cliente1{
	
	// 2. Declarando os atibutos/variáveis da classe Cliente:
	public String nomeCliente;
	public int idadeCliente;
	public double saldoCliente;
	
	public Cliente1(String nomeCliente, int idadeCliente, double saldoCliente) {
		this.nomeCliente = nomeCliente;
		this.idadeCliente = idadeCliente;
		this.saldoCliente = saldoCliente;
	}
	// Criando metodo para imprimir informação:
	public void imprimirInf() {
		System.out.println("Seu nome é "+nomeCliente+", você têm "+idadeCliente+" e seu saldo na conta é de: "+saldoCliente);
	}
	// Criação de Construtores pelo source>:
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getIdadeCliente() {
		return idadeCliente;
	}
	public void setIdadeCliente(int idadeCliente) {
		this.idadeCliente = idadeCliente;
	}
	public double getSaldoCliente() {
		return saldoCliente;
	}
	public void setSaldoCliente(double saldoCliente) {
		this.saldoCliente = saldoCliente;
	}
	
	
	
	// 3. Criação do método especial CONSTRUTOR: 
	
	
}
