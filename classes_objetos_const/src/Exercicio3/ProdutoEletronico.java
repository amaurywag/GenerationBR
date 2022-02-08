package Exercicio3;

import java.util.Scanner;

public class ProdutoEletronico {
	
	String nomeDoProduto;
	int polegadasdoProduto;
	double valorDoProduto;
	
	Scanner leia = new Scanner(System.in);
	
	
	//métodos
	public void nomeDoProduto() {	
		System.out.print("Qual será o produto? ");
		nomeDoProduto = leia.next();
	}
	
	public ProdutoEletronico(int polegadasdoProduto, double valorDoProduto) {
	
	this.nomeDoProduto = nomeDoProduto;
	this.polegadasdoProduto = polegadasdoProduto;
	this.valorDoProduto = valorDoProduto;
	}
	
	public void printInf() {
		System.out.println(nomeDoProduto+" de "+polegadasdoProduto+" polegadas, está custando R$"+valorDoProduto+" de reais.");
	}

	public int getPolegadasdoProduto() {
		return polegadasdoProduto;
	}

	public void setPolegadasdoProduto(int polegadasdoProduto) {
		this.polegadasdoProduto = polegadasdoProduto;
	}

	public double getValorDoProduto() {
		return valorDoProduto;
	}

	public void setValorDoProduto(double valorDoProduto) {
		this.valorDoProduto = valorDoProduto;
	}
	
}
