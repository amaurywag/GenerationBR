package Exercicio7;

public class Paciente {
	String nome;
	int idade;
	String doenca;
	
	public Paciente(String nome, int idade, String doenca) {
		this.nome = nome;
		this.idade = idade;
		this.doenca = doenca;
	}
	public void Print() {
		System.out.println("Paciente "+nome+" têm "+idade+" anos e está internado com "+doenca);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDoenca() {
		return doenca;
	}
	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}
	
}
