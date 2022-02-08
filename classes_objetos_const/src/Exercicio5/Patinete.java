package Exercicio5;

import java.util.Scanner;

public class Patinete {
	
	String modelo;
	int rodas;
	double valor;
	
	Scanner leia = new Scanner(System.in);
	
	public void PegaModelo() {
		System.out.println("Qual o modelo? ");
		modelo = leia.next();
	}
	public void PegaRodas() {
		System.out.println("Quantas rodas o patinete têm? ");
		rodas = leia.nextInt();
	}
	public void Escreva() {
		System.out.println("\nO seu patinete é do modelo "+modelo+", ele têm "+rodas+" rodas e custa o valor de R$ "+valor+"\n");
	}
	public Patinete(double valor) {
		this.valor = valor;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}	
}
