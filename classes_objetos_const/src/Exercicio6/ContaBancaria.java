package Exercicio6;

public class ContaBancaria {
	String nome;
	double contaPoupanca;
	double contaCorrente;
	double soma;

	public void SomaContas() {
		soma = contaPoupanca+contaCorrente;
	}
	public ContaBancaria(String nome, double contaPoupanca, double contaCorrente) {
		this.nome = nome;
		this.contaPoupanca = contaPoupanca;
		this.contaCorrente = contaCorrente;
	}
	public void Escreva() {
		System.out.println(nome+"\nConta poupança: R$"+contaPoupanca+"\nConta corrente: R$"+contaCorrente+"\nValor total: R$ "+soma);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getContaPoupanca() {
		return contaPoupanca;
	}
	public void setContaPoupanca(double contaPoupanca) {
		this.contaPoupanca = contaPoupanca;
	}
	public double getContaCorrente() {
		return contaCorrente;
	}
	public void setContaCorrente(double contaCorrente) {
		this.contaCorrente = contaCorrente;
	}
}