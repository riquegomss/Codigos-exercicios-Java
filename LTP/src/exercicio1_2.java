import java.util.*;
public class exercicio1_2 {
	public static void main(String[] args) {
	
		// variaveis
		
		String nome;
		float salario;
		float nvsalario;
		Scanner leia = new Scanner(System.in);
		
		// entrada
		
		System.out.print("nome: " );
		nome = leia.nextLine();
		System.out.print("digite o salario: ");
		salario = leia.nextFloat();
		
		// calculos
		
		nvsalario = (float) 15/100 * salario + salario;
		
		// saida
		
		System.out.println("novosalario: " + nvsalario);
		
			
	}

}
