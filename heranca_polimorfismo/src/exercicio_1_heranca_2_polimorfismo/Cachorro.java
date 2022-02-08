package exercicio_1_heranca_2_polimorfismo;

public class Cachorro extends Animal{
	private boolean deveCorrer = true;
	
	public Cachorro(String nome, int idade, String emiteSom, boolean deveCorrer){
		super(nome,idade,emiteSom);
		this.deveCorrer = deveCorrer;
	}

	public boolean isDeveCorrer() {
		return deveCorrer;
	}

	public void setDeveCorrer(boolean deveCorrer) {
		this.deveCorrer = deveCorrer;
	}
	public String getemiteSom(){
		return "Latidos"+super.getemiteSom();
	}
}
