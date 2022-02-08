package exercicio_1_heranca;

public class Preguica extends Animal{
	private boolean deveSubirEmArvores = true;
	
	public Preguica(String nome, int idade, boolean emiteSom, boolean deveSubirEmArvores) {
		super(nome, idade, emiteSom);
		this.deveSubirEmArvores = deveSubirEmArvores;
	}

	public boolean isDeveSubirEmArvores() {
		return deveSubirEmArvores;
	}

	public void setDeveSubirEmArvores(boolean deveSubirEmArvores) {
		this.deveSubirEmArvores = deveSubirEmArvores;
	}
	
}
