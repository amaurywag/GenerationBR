package Exercicio2;

public class Aviao {
	
	String cor;
	String tamanho;
	int quantidadeDePessoas;
	
	public Aviao(String cor, String tamanho, int quantidadeDePessoas) {
	
	this.cor = cor;
	this.tamanho = tamanho;
	this.quantidadeDePessoas = quantidadeDePessoas;
	
	}
	
	public void imprimirInfo() {
		System.out.println("O seu avião é da cor "+cor+", tamanho "+tamanho+" e cabem "+quantidadeDePessoas+" pessoas");
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public int getQuantidadeDePessoas() {
		return quantidadeDePessoas;
	}

	public void setQuantidadeDePessoas(int quantidadeDePessoas) {
		this.quantidadeDePessoas = quantidadeDePessoas;
	}
}
