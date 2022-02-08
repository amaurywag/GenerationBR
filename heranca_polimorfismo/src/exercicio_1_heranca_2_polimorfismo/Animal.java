package exercicio_1_heranca_2_polimorfismo;

public class Animal {
	private String nome;
	private int idade;
	private String emiteSom;
	
	public Animal(String nome, int idade, String emiteSom) {
		this.nome = nome;
		this.idade = idade;
		this.emiteSom = emiteSom;
		
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

	public String  getemiteSom() {
		return emiteSom;
	}

	public void setemiteSom(final String emiteSom) {
		this.emiteSom = emiteSom;
	}
	
}
