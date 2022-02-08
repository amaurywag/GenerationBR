package Exercicio4;

import java.util.Scanner;

public class Funcionario {
	String nome;
	String cargo;
	double salario;
	
	Scanner leia = new Scanner(System.in);
	
	public void PegaNome() {
		System.out.println("Digite o nome do funcionário: ");
		nome = leia.next();
	}
	public Funcionario(String cargo, double salario) {
		this.cargo = cargo;
		this.salario = salario;
	}
	public void inf() {
		System.out.println(nome+" tem o cargo de "+cargo+" e ganha o valor de R$ "+salario);
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
