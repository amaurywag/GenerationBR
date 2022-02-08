package Exercicio4;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("vendedor",2.000);
		Funcionario funcionario2 = new Funcionario("diretor",2.000);
		funcionario1.PegaNome();
		funcionario1.inf();
		funcionario2.PegaNome();
		funcionario2.inf();

	}

}
