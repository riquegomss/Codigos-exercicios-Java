import java.util.Scanner;
public class exercicio1_3 {
	public static void main(String[] args) {
		
		// variaveis
		
		float valor;
		float taxa;
		float rendimento;
		float total;
		Scanner leia = new Scanner(System.in);
		
		// entradas
		
		System.out.print("digite o valor: ");
		valor = leia.nextFloat();
		System.out.print("digite a taxa: ");
		taxa = leia.nextFloat();
		
		// calculos
		
		rendimento = valor * (taxa / 100);
		total = valor + rendimento;
		
		System.out.println("Rendimento: R$ " + rendimento);
		System.out.println("Valor total apos rendimento: R$ " + total);
		
	}

}
