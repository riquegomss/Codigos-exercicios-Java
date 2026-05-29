import java.util.*;
public class exercicio2_4 {
	public static void main(String[] args) {
		
		//variaveis
		
		String nome;
		float nota1;
		float nota2;
		float nota3;
		float media;
		String resultado;
		Scanner leia = new Scanner(System.in);
		
		// entrada
		
		System.out.print("Digite o nome do aluno: ");
		nome = leia.next();
		System.out.print("Digite a nota 1: ");
		nota1 = leia.nextFloat();
		System.out.print("Digite a nota 2: ");
		nota2 = leia.nextFloat();
		System.out.print("Digite a nota 3: ");
		nota3 = leia.nextFloat();
		
		// calculo 
		
		media = ( nota1 + nota2 + nota3) / 3;
		
		if (media >= 7) {
			System.out.println("nota: " + media);
			System.out.println(nome + " Aprovado");
		} else if (media >= 4.1 && media < 7 ) {
			System.out.println("nota: " + media);
			System.out.println(nome + " em Recuperação");
		} else {
			System.out.println("nota: " + media);
			System.out.println(nome + " Reprovado");
			
			
		}
		
		

	}

}
