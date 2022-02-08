package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio_1_collections {
	
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);

		List<String> lista = new ArrayList<String>();
		int op = 1;

		do {
			System.out.println("\n=====================================================================");
			System.out.println("\n\t\tS E L E C I O N E   U M A   O P Ç Ă O");
			System.out.println("\n1. Adicionar produto");
			System.out.println("2. Remover produto");
			System.out.println("3. Alterar produto");
			System.out.println("0. Sair do sistema");
			System.out.println("\n=====================================================================");
			op = leia.nextInt();

			switch (op) {
			case 1:
				System.out.print("Digite o produto que deseja adicionar:");
				String produto;
				produto = leia.next();
				lista.add(produto);
				System.out.println(lista);
				break;
			case 2:
				System.out.print("Digite o produto que deseja remover:");
				String premoverProduto = leia.next();
				
				if(lista.contains(premoverProduto)) {
					lista.remove(premoverProduto);
					System.out.println(lista);
				} else {
					System.out.println("Produto não encontrado.");
				}
				
				break;
			case 3:
				System.out.println("Digite o produto a se substituido:");
				produto = leia.next();
				
				if(lista.contains(produto)) {
					
					int posicao = 0;
					
					for(int i=0; i<lista.size(); i++) {
						if((lista.get(i)).equals(produto)) {
					
							System.out.print("Digite o novo produto: ");
							String substituirProduto = leia.next();
							posicao = i;
							lista.set(posicao,substituirProduto);
							
							System.out.println(lista);
						} else {
						}
					}
					
				} else {
					System.out.println("Produto năo encontrado!");
				}
				
				break;
				default:
					if(op == 0) {
						System.out.println("Obrigado. Até breve!");
					} else {
						System.out.println("Opção inválida.");
					}
			}
		} while (op!= 0);
	}
}
