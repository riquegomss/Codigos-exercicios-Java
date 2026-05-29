import java.util.*;
public class exercicio3_4 {
	public static void main(String[] args) {
		
		// VARIAVEIS
		
		int matricula;
		String nome;
		float nota1;
		float nota2;
		float nota3;
		int turma = 0;
		float mediaAlu;
		float notaFinal;
		float somaNotas = 0;

		float maiorNota = 0;
		String nomeMaiorNota = "";

		Scanner leia = new Scanner(System.in);
		
		// ENTRADA
		
		System.out.print("Digite a matricula: ");
		matricula = leia.nextInt();
		
		while(matricula != 999 ) {
			
			System.out.print("Digite o nome do Aluno: ");
			nome = leia.next();
			
			System.out.print("Digite a Nota1: ");
			nota1 = leia.nextFloat();
			
			System.out.print("Digite a nota2: ");
			nota2 = leia.nextFloat();
			
			System.out.print("Digite a nota3: ");
			nota3 = leia.nextFloat();
			
			//CALCULO
			
			notaFinal = nota1 + nota2 + nota3;
			
			if (notaFinal >= 60) {
				System.out.println("Aluno Aprovado!");
			} else {
				System.out.println("Aluno reprovado");
			}
			
			if (notaFinal > maiorNota) {
				maiorNota = notaFinal;
				nomeMaiorNota = nome;
			}
			
			turma++;
			somaNotas = somaNotas + notaFinal;
			
			System.out.print("Digite a matricula: ");
			matricula = leia.nextInt();
		}
		// SAIDA
		
		mediaAlu = somaNotas / turma;
		
		System.out.println("São: " + turma + " Alunos");
		System.out.println("Media da Turma: " + mediaAlu);
		System.out.println("Aluno com maior nota: " + nomeMaiorNota);
		System.out.println("Maior nota: " + maiorNota);
	}
}