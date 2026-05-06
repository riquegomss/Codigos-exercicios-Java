import java.util.*;
public class exercicio6_1 {
	public static void main(String[] args) {

		String nome;
		int fileira;
		int cadeira;
		float precPass = 0;
		String MapaVoo [] [] = new String [20] [6];
		float somaPreçosPass = 0;
		float somaPrecoPrimeiraClass = 0;
		int contVagasJane = 40;
		Scanner leia = new Scanner (System.in);

		do {	
			System.out.println("Digite o nome: ");
			nome = leia.next();
			if (nome.equals("FIM")) {
				break;
			}
			do {
				System.out.println("Digite a fileira: ");
				fileira = leia.nextInt();
				if (fileira < 1 && fileira > 20) {
					System.out.println("Numero de cadeira errado digite novamente!");
				}
			} while (fileira < 1 && fileira > 20);
			do {
				System.out.println("Digite a cadeira: ");
				cadeira = leia.nextInt();
				if (cadeira < 1 && cadeira > 6) {
					System.out.println("Cadeira errada digite novamente!");
				}
			} while (cadeira < 1 && cadeira > 6);

			MapaVoo [fileira - 1] [cadeira - 1] = nome;

			if (fileira == 1 || fileira <= 3) {
				precPass = 900;
				somaPrecoPrimeiraClass = precPass + precPass;
			}else if (fileira <= 8){
				precPass = 700;
			}else {
				precPass = 350;
			}
			somaPreçosPass = precPass + precPass;
			if(cadeira == 1 || cadeira < 20) {
				contVagasJane --;
				System.out.println("Preco da passagem: " + precPass);
			}
		} while (! nome.equals("FIM"));
		System.out.println("Total Faturado: " + somaPrecoPrimeiraClass);
		System.out.println("Total Faturado: " + somaPrecoPrimeiraClass);
		System.out.println("Numero vagos janelas: " + contVagasJane);

		System.out.println();
		System.out.println("MAPA DO VOO");
		System.out.println("    1       2       3       4");
		for(byte linha = 0; linha <= 19; linha ++) {
			System.out.print( linha + 1);
			for(byte coluna = 0; coluna <= 5; coluna ++) {
				if (MapaVoo [linha][coluna] == null) {
					System.out.print("    ");
				}else {
					System.out.print("   " + MapaVoo[linha][coluna]);
				}
			}
			System.out.println();

		}
	}

}
