import	java.util.*;
public class Exemplo {
	public static void main(String[] args) {
		// 1 - declaracao de variaveis
		float salario;
		float vlrAumento;
		float novoSal;
		// 2 - entrada
		Scanner leia;
		leia = new Scanner(System.in);
		System.out.print("Digite o Salário: ");
		salario = leia.nextFloat();
		System.out.print("Digite o Valor do Aumento: ");
		vlrAumento = leia.nextFloat();
		// 3 - calculo
		novoSal = salario + vlrAumento;
		// 4 - saida
		
		System.out.print("Novo salário:" + novoSal );
	}

}
