import java.util.*;
public class exercicio6_3 {
	public static void main(String[] args) {
		
		float custoprod [] = new float [3];
		int produtosearma [] [] = new int [3][3];
		byte produtos;
		byte armazem;
		int totalArmazem[] = new int[3];
		Scanner leia =  new Scanner(System.in);
		
		for(byte x = 0; x <= 2; x++) {
			System.out.println("Digite o custo do produto: " + x + ":");
			custoprod[x] = leia.nextFloat();
		}
		
		for(produtos = 0; produtos <= 2; produtos++) {
			for(armazem = 0; armazem <= 2; armazem++) {
				System.out.println("Digite a quantidade de produtos " + produtos + " no armazem " + armazem + " : ");
				produtosearma[produtos][armazem] = leia.nextInt();
				
				totalArmazem[armazem] += produtosearma[produtos][armazem];
			}
		}
		
		int maior = totalArmazem[0];
		int posicao = 0;

		for (int i = 1; i < 3; i++) {
			if (totalArmazem[i] > maior) {
				maior = totalArmazem[i];
				posicao = i;
			}
		}

		System.out.println("Armazém com mais produtos: " + (posicao + 1));

		System.out.println("Custo por produto em cada armazém:");
		for (int produto = 0; produto < 3; produto++) {
			for (int arm = 0; arm < 3; arm++) {
				float custo = produtosearma[produto][arm] * custoprod[produto];
				System.out.println("Produto " + produto +
						" no Armazém " + arm + ": R$ " + custo);
			}
		}
		System.out.println("Custo total por armazém:");
		float totalGeral = 0;

		for (int arm = 0; arm < 3; arm++) {
			float total = 0;
			for (int produto = 0; produto < 3; produto++) {
				total += produtosearma[produto][arm] * custoprod[produto];
			}
			System.out.println("Armazém " + arm + ": R$ " + total);
			totalGeral += total;
		}
		System.out.println("Custo total geral: R$ " + totalGeral);
	}
}