package padrao;

/**
 * @author MatheusMoura-26
 * feito no dia 20/02
Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.

 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
		//Scanner para poder entrar com dados
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a palavra que deseja verificar quantos anagramas a mesma possui:");
		//Capturando palavra que queremos saber quantos anagrams são possíveis através da mesma
		String palavra = sc.next();


		// Usando HashMap para armazenar elementos
		HashMap<String, Integer> lista = new HashMap<>();

		// Usando for, sempre que o loop y finalizar será iniciado novamente o loop x, amabos os loops terminam um ciclo quando chegam ao valor que é igual ao tamanho de caracteres da palavra digitada
		for (int i = 0; i <= palavra.length(); i++) {
			for (int j = i; j < palavra.length(); j++) {
				
				//Esse array irá armazenar os sub-arrays, até chegar no inteiro que é igual a quantidade caracteres da palavra digitada acima
				char[] palavraArray = palavra.substring(i, j + 1).toCharArray();
				Arrays.sort(palavraArray);
				//StringPalavra irá rececber o valor de todos os elementos do array palavraArray
				String stringPalavra = new String(palavraArray);
				if (lista.containsKey(stringPalavra)) {
					lista.put(stringPalavra, lista.get(stringPalavra) + 1);
				} else {
					lista.put(stringPalavra, 1);
				}
			}
		}

		//útima contagem visando o valor de anagramas possíveis atráves da palavra digitada
		int valorFinal = 0;
		for (String cont : lista.keySet()) {
			int l = lista.get(cont);
			valorFinal += ((l - 1)*l)/2;
		}

		System.out.print(valorFinal);

		//Fechando o Scanner
		sc.close();
	}

}
