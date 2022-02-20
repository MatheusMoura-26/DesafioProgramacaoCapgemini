package padrao;
/**
 * @author MatheusMoura-26
 *feito no dia 15/02 
 * Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.
 */

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		//Scanner para poder entrar com dados
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite quantos andares a escada deve ter:");
		int andares = sc.nextInt();
		
		//Criação de array para armazenar strings
		String[] escada = new String[andares];
				//Fimm do correto
		//For para atribuição de espaços 
		for(int i =0; i <= escada.length-1;i++) {
			escada[i]=" ";			
		}
		
		//for para atribuição de *
		for(int j = escada.length-1; j>=0;j--) {
			escada[j]="*";
			//For para exibição do conteúdo de arrays e formação da escada
			for(int k =0; k <= escada.length-1;k++) {
				System.out.printf("%s",escada[k]);
				
			}
			System.out.println();
		}
				
		//fechando o scanner
		sc.close();
	}

}
