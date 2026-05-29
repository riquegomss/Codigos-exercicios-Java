import java.util.*;
public class exercicio2_3 {
	public static void main(String[] args) {
		
		//variaveis
		
		String nome;
		float salario;
		float nvsalario;
		Scanner leia = new Scanner(System.in);
		
		//entrada
		
		System.out.print("digite o nome da empresa: ");
		nome = leia.nextLine();
		System.out.print("digite o salario: ");
		salario = leia.nextFloat();
		
		if (salario <= 1000) {
			nvsalario = salario * 15/100 + salario;
			} else {
				nvsalario = salario * 10/100 + salario;
			}
		
		//saida 
		System.out.println("Nome da empresa: " + nome);
		System.out.println("novo salario: " + nvsalario);
		
	}
}
