package for_;

import java.util.Scanner;

public class exercicio_4_while {

	public static void main(String[] args) {
		/* Uma empresa desenvolveu uma pesquisa para saber as características psicológicas
		 * dos indivíduos de uma região. Para tanto, a cada uma das pessoas era perguntado:
		 * idade, sexo (1-feminino / 2-masculino / 3-outros), e as opções (1 - se a pessoa
		 * era calma / 2 - se a pessoa era nervosa / 3 - se a pessoa era agressiva). 
		 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas,
		 * calcule e mostre: (WHILE)
		 * 1. O número de pessoas calmas;
		 * 2. O número de mulheres nervosas; 
		 * 3. O número de homens agressivos;
		 * 4. O número de outros calmos;
		 * 5. O número de pessoas nervosas com mais de 40 anos;
		 * 6. O número de pessoas calmas com menos de 18 anos.
		 */
		
		int idade, sexo, fTemp, mTemp=0, oTemp, contP=0;
		int contMcalmas=0, contMnerv=0, contMagre=0;
		int contHcalmos=0, contHnerv=0, contHagre=0;
		int contOcalmos=0, contOnerv=0, contOagre=0;
		int idadeMcalmasMenor=0,idadeMnervMenor=0,idadeMagreMenor=0;
		int idadeMcalmasMaior=0,idadeMnervMaior=0,idadeMagreMaior=0;
		int idadeHcalmosMenor=0,idadeHnervMenor=0,idadeHagreMenor=0;
		int idadeHcalmosMaior=0,idadeHnervMaior=0,idadeHagreMaior=0;

		
		Scanner leia = new Scanner(System.in);
		
		do {
			contP +=1;
			idade = leia.nextInt();
			
			System.out.print("-------------------- M E N U --------------------\n");
			System.out.print("Escolha o gênero que você se identifica:\n1. Feminino\n2. Masculino\n3. Outro ... ");
			sexo = leia.nextInt();
			
			if(sexo==1) {
				System.out.print("\nEntão, me diz. Você é:\n1. Calma\n2. Nervosa\n3. Agressiva\n");
				fTemp = leia.nextInt();
				if(fTemp==1) {
					contMcalmas+=1;
					System.out.print("Qual sua idade? ");
					idade = leia.nextInt();
					if(idade>40) {
						idadeMcalmasMaior+=1;
					}
					else if(idade<18) {
						idadeMcalmasMenor+=1;
					}
				}
				else if(fTemp==2) {
					contMnerv+=1;
					System.out.print("Qual sua idade? ");
					idade = leia.nextInt();
					if(idade>40) {
						idadeMnervMaior+=1;
					}
					else if(idade<18) {
						idadeMnervMenor+=1;
					}
				}
				else if(fTemp==3) {
					contMagre+=1;
					System.out.print("Qual sua idade? ");
					idade = leia.nextInt();
					if(idade>40) {
						idadeMagreMaior+=1;
					}
					else if(idade<18) {
						idadeMagreMenor+=1;
					}
				}
			}
			else if(sexo==2) {
				System.out.print("\nEntão, me diz. Você é:\n1. Calmo\n2. Nervoso\n3. Agressivo\n");
				mTemp = leia.nextInt();
				if(mTemp==1) {
					contHcalmos+=1;
					System.out.print("Qual sua idade? ");
					idade = leia.nextInt();
					if(idade>40) {
						idadeHcalmosMaior+=1;
					}
					else if(idade<18) {
						idadeHcalmosMenor+=1;
					}
					}
				}
				else if(mTemp==2) {
					contHnerv+=1;
					System.out.print("Qual sua idade? ");
					idade = leia.nextInt();
					
					if(idade>40) {
						idadeHnervMaior+=1;
					}
					else if(idade<18) {
						idadeHnervMenor+=1;
				}
					
				else if(mTemp==3) {
					contHagre+=1;
				}
			}
			else if(sexo==3) {
				System.out.print("\nEntão, me diz. Você é:\n1. Calme\n2. Nervose\n3. Agressive\n");
				oTemp = leia.nextInt();
				if(oTemp==1) {
					contOcalmos+=1;
				}
				else if(oTemp==2) {
					contOnerv+=1;
				}
				else if(oTemp==3) {
					contOagre+=1;
				}
			}
		}
		while(contP!=6);
		System.out.print("-------------------- R E S U L T A D O --------------------\n");	
		System.out.print("Número de pessoas calmas: "+(contMcalmas+contHcalmos+contOcalmos)+"\n");
		System.out.print("Número de mulheres nervosas: "+contMnerv+"\n");
		System.out.print("Núméro de homens agressivos: "+contHagre+"\n");
		System.out.print("Núméro de outros calmos: "+contOcalmos+"\n");
		System.out.print("Núméro de pessoas nervosas com mais de 40 anos: \n");
		System.out.print("Núméro de pessoas calmas com menos de 18 anos: \n");	
	}
			
}

