package padrao;
/**
 * @author MatheusMoura-26
 * fito no dia 17/02
 * Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:
Possui no mínimo 6 caracteres.
Contém no mínimo 1 digito.
Contém no mínimo 1 letra em minúsculo.
Contém no mínimo 1 letra em maiúsculo.
Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+

 */

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		//Scanner para poder entrar com dados
		Scanner sc = new Scanner(System.in);

		//Perguntando o nome e insenrido-o
		System.out.println("Digite seu nome:");
		String nome = sc.next();
		//Perguntando a senha e insenrido-a
		System.out.println("Digite sua senha:");
		String senha = sc.next();
		//Criação de variavéis para calculos futuros
		int adiciona = 0;
		int tamanho = senha.length();
		int incremento = 0;

		//Verificação se a senha possui digitos utilizando a função substring e usando matches para verificação caso tenhamos digitos
		if (senha.substring(0).matches("[^0-9]*")) {
			System.out.println("não  Contem números");
			incremento++;
			System.out.println(senha.substring(0, tamanho - 1));
			System.out.println("Incremento ++");
		}
		//Verificação se a senha possui caracteres especiais utilizando o contains
		if (senha.contains("!") || (senha.contains("@")) || (senha.contains("#")) || (senha.contains("$"))
				|| (senha.contains("%")) || (senha.contains("^")) || (senha.contains("&")) || (senha.contains("*"))
				|| (senha.contains("(")) || (senha.contains(")")) || (senha.contains("-")) || (senha.contains("+"))) {
			System.out.println("Contem especiais ");

		} else {
			System.out.println("Não contem especiais");
			System.out.println("incremento++");
			incremento++;
		}
		
		//Verificação se a senha possui letars Maiuscúlas utilizando a função substring e usando matches para verificação caso tenhamos letars Maiúsculas
		if (senha.substring(0).matches("[^A-Z]*")) {
			System.out.println("não Tem maisuculas");
			incremento++;
			System.out.println("incremento++");
		}
		
		//Verificação se a senha possui letars Minúsculas utilizando a função substring e usando matches para verificação caso tenhamos letras minúsculas
		if (senha.substring(0, tamanho - 1).matches("[^a-z]*")) {
			System.out.println("não Tem minusculas  ");
			System.out.println("incremento++");
			incremento++;
		}
		
		//Switch visando sáida de dados. Dependendo da quantidade de caracteres da senha o programa irá mostrar quantos caracteres são necessários para uma senha válida
		switch (senha.length()) {
			case 1:
				System.out.println("Caso 1");
				adiciona = 5;
				break;
			case 2:
				System.out.println("Caso 2");
				adiciona = 4;
				break;
			case 3:
				System.out.println("Caso 3");
				adiciona = 3;
				break;
			//A partir de quatro letras, se o número de caracteres obrigatorios não inseridos na senha for maior do que a subtração de 6 - quantidades de caracteres na senha, o número de caracteres a ser adcionado passa a ser o número de caractere obrigatorios não adicionados 
			case 4:
				System.out.println("Caso 4");
				if (incremento < 3) {
					adiciona = 2;
				} else {
					adiciona = incremento;
				}
				break;
			case 5:
				System.out.println("Caso 5");
				if (incremento < 2) {
					adiciona = 1;
				} else {
					adiciona = incremento;
				}
				break;
			default:
				adiciona = incremento;

			}
		//Saída de dados
		System.out.println(adiciona);

		//fechando o scanner
		sc.close();
	}

}
