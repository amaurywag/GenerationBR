package exercicio_1_heranca_2_polimorfismo;

public class Preguica extends Animal{
	private boolean deveSubirEmArvores = true;
	
	public Preguica(String nome, int idade, String emiteSom, boolean deveSubirEmArvores) {
		super(nome, idade, emiteSom);
		this.deveSubirEmArvores = deveSubirEmArvores;
	}

	public boolean isDeveSubirEmArvores() {
		return deveSubirEmArvores;
	}

	public void setDeveSubirEmArvores(boolean deveSubirEmArvores) {
		this.deveSubirEmArvores = deveSubirEmArvores;
	}
	public String getemiteSom() {
		return "Não emite som"+super.getemiteSom();
	}
	
}
