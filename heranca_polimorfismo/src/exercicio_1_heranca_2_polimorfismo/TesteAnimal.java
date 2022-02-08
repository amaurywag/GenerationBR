package exercicio_1_heranca_2_polimorfismo;

public class TesteAnimal {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro("Doguinho",10, ", emite som.", false);
		Cavalo cavalo = new Cavalo("Calavinho",20, ", emite som", false);
		Preguica preguica = new Preguica("Preguicinha",35, ",!!", false);
		
		System.out.println(cachorro.getNome());
		System.out.println(cachorro.getemiteSom());
		System.out.println(cavalo.getNome());
		System.out.println(cavalo.getemiteSom());
		System.out.println(preguica.getNome());
		System.out.println(preguica.getemiteSom());
	}

}
