import java.util.*;

public class exercicio10_2 {

	public static void main(String[] args) {

		String nome = " ";
		String login;
		String senhagerada;
		boolean valido = true;

		Scanner leia = new Scanner(System.in);

		for (int x = 0; x <= 30; x++) {

			do {

				valido = true;

				System.out.println("Digite o nome (FIM para encerrar): ");
				nome = leia.nextLine().toUpperCase();

				if (nome.equals("FIM")) {
					break;
				}

				if (nome.length() < 15) {

					System.out.println("Minimo são 15 caracteres!");
					valido = false;

				} else if (nome.charAt(0) == ' ' || nome.charAt(nome.length() - 1) == ' ') {

					System.out.println("Não deve ter espaços antes e depois do nome!");
					valido = false;

				} else if (!nome.contains(" ")) {

					System.out.println("Deve ter nome e sobrenome");
					valido = false;

				} else if (nome.contains("  ")) {

					System.out.println("Deve ter somente um espaço entre os nomes!");
					valido = false;

				} else {

					for (byte a = 0; a < nome.length(); a++) {

						if ((nome.charAt(a) < 'A' || nome.charAt(a) > 'Z')
								&& nome.charAt(a) != ' ') {

							System.out.println("Deve ter somente letras!");
							valido = false;
							break;
						}
					}
				}

			} while (!valido);

			if (nome.equals("FIM")) {
				break;
			}
			byte senha;
			login = gerarLogin(nome);
			senhagerada = gerarSenha(login);
			System.out.println("Login: " + login);
			System.out.println("Senha: " + senhagerada);
		}
	}

	public static String gerarLogin(String nome) {
		
		String login = nome.substring(0, 1);
		for (int x = 0; x < nome.length(); x++) {
			if (nome.charAt(x) == ' ') {
				login = login + nome.charAt(x + 1);
			}
		}
		return login;
	}
	public static String gerarSenha (String login) {
		String senha = "";
		for(byte d = 0; d < login.length(); d++) {
			senha = senha + (int) login.charAt(d) / 10;
		}
		return senha;
	}
	
}