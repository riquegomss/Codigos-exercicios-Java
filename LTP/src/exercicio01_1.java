import java.util.*;
public class exercicio1_1 {
	public static void main(String[] args) {
		// 1 declarar as variaveis
		
		String nomeAluno;
		byte nota1;
		byte nota2;
		byte nota3;
		byte notafinal;
		float mediaNotas;
		Scanner leia = new Scanner(System.in);
		
		//2 entrada de dados
		
		System.out.print("digite o nome do aluno: ");
		nomeAluno = leia.nextLine();
		System.out.print("digite a nota 1: ");
		nota1 = leia.nextByte();
		System.out.print("digite a nota 2: ");
		nota2 = leia.nextByte();
		System.out.print("digite a nota 3: ");
		nota3 = leia.nextByte();
		
		// 3 - calculos 
		
		notafinal = (byte)(nota1 + nota2 + nota3);
		mediaNotas = (float)notafinal / 3;
		
		// 4 - saidas
		
		System.out.println("Nota Final do aluno" + notafinal);
		System.out.println("Media de notas da turma" + mediaNotas);
		
		

	}

}
