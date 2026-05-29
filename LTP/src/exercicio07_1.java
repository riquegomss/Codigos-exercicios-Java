import java.util.*;
public class exercicio7_1 {
	public static void main(String[] args) {

		String cidade[] = new String[20];
		int distancia[] = new int[20];
		String cidadePesquisa;
		int cont;
		Scanner leia = new Scanner(System.in);

		for (cont = 0; cont < 20; cont++) {

			do {
				System.out.print("Digite o nome da cidade (FIM para encerrar): ");
				cidade[cont] = leia.next();
				if (cidade[cont].equals("")) {
					System.out.println("Nome da cidade é obrigatório!");
				}

			} while (cidade[cont].equals(""));

			if (cidade[cont].equalsIgnoreCase("fim")) {
				break;
			}

			do {
				System.out.print("Digite a distância até Belo Horizonte (mínimo 500 km): ");
				distancia[cont] = leia.nextInt();

				if (distancia[cont] < 500) {
					System.out.println("Distância inválida! Deve ser no mínimo 500 km.");
				}

			} while (distancia[cont] < 500);
		}

		int totalCidades = cont;
		while (true) {
			System.out.print("Digite uma cidade para consulta (FIM para sair): ");
			cidadePesquisa = leia.next();

			if (cidadePesquisa.equalsIgnoreCase("fim")) {
				break;
			}

			int indice = -1;

			for (int i = 0; i < totalCidades; i++) {
				if (cidade[i].equalsIgnoreCase(cidadePesquisa)) {
					indice = i;
					break;
				}
			}

			if (indice == -1) {
				System.out.println("Cidade não encontrada!");
			} else {
				float precoPassagem = distancia[indice] * 0.25f;
				float tempoMin = (distancia[indice] / 800.0f) * 60;
				int escalas = (int) ((distancia[indice] / 800.0) / 3);

				System.out.println("Preço da passagem: R$ " + precoPassagem);
				System.out.println("Tempo de voo: " + tempoMin / 60 + "h");
				System.out.println("Número de escalas: " + escalas);
			}
		}

	}
}