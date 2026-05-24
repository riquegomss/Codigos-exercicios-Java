import java.util.*;

public class exercicio10_1 {

	public static void main(String[] args) {

		String nomeDigi;

		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o nome em letras minusculas: ");
		nomeDigi = leia.nextLine();
		
		System.out.println(nomeDigi);
		nomeDigi = eliminarEspacoEsquerda(nomeDigi);
		System.out.println(nomeDigi);
		nomeDigi = eliminarEspacoDireita(nomeDigi);
		System.out.println(nomeDigi);
		nomeDigi = eliminarEspacoEntre(nomeDigi);
		System.out.println(nomeDigi);
		System.out.println("Primeira letra maiuscula:");
		System.out.println(converterPrimeiraLetraMaisculo(nomeDigi));

		System.out.println("Primeira letra de cada palavra maiuscula:");
		System.out.println(converterPrimeiraLetraCadaNomeMaiusc(nomeDigi));

	}

	public static String converterPrimeiraLetraMaisculo(String nome) {

		nome = Character.toUpperCase(nome.charAt(0)) + nome.substring(1);

		return nome;
	}

	public static String converterPrimeiraLetraCadaNomeMaiusc(String nome) {

		nome = converterPrimeiraLetraMaisculo(nome);

		for (int x = 0; x < nome.length() - 1; x++) {

			if (nome.charAt(x) == ' ') {

				nome = nome.substring(0, x + 1)
						+ Character.toUpperCase(nome.charAt(x + 1))
						+ nome.substring(x + 2);
			}
		}
		return nome;
	}
	public static String eliminarEspacoEsquerda(String nome) {

		while (nome.charAt(0) == ' ') {

			nome = nome.replaceFirst(" ", "");
		}

		return nome;
	}
	
	public static String eliminarEspacoDireita(String nome) {
		while (nome.charAt(nome.length() -1) == ' ') {
			nome = nome.substring(0, nome.length() -1);
		}
		return nome;
	}
	
	public static String eliminarEspacoEntre(String nome) {
		while (nome.contains("  ")) {

			nome = nome.replace("  ", " ");
		}
		return nome;
	}
}