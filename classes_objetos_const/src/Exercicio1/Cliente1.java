package Exercicio1;
	
	//1. Cliando a classe cliente
	//qualificador de acessos (public) + class + nome da class (Cliente):
public class Cliente1{
	
	// 2. Declarando os atibutos/vari�veis da classe Cliente:
	public String nomeCliente;
	public int idadeCliente;
	public double saldoCliente;
	
	public Cliente1(String nomeCliente, int idadeCliente, double saldoCliente) {
		this.nomeCliente = nomeCliente;
		this.idadeCliente = idadeCliente;
		this.saldoCliente = saldoCliente;
	}
	// Criando metodo para imprimir informa��o:
	public void imprimirInf() {
		System.out.println("Seu nome � "+nomeCliente+", voc� t�m "+idadeCliente+" e seu saldo na conta � de: "+saldoCliente);
	}
	// Cria��o de Construtores pelo source>:
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
	
	
	
	// 3. Cria��o do m�todo especial CONSTRUTOR: 
	
	
}
