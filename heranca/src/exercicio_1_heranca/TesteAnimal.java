package exercicio_1_heranca;

public class TesteAnimal {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro("Doguinho",10,true, true);
		Cavalo cavalo = new Cavalo("Calavinho",20, true, true);
		Preguica preguica = new Preguica("Preguicinha",35,true,false);
		
		System.out.println(cachorro.getNome());
		System.out.println(cavalo.isEmiteSom());
		System.out.println(preguica.getIdade());
	}

}
