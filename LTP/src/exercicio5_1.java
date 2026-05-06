import java.util.*;

public class exercicio5_1 {
	public static void main(String[] args) {

		// variaveis

		float notas;
		float mediaNotas[] = new float[30];
		float somadasnotas = 0;
		float somamedias = 0;
		int contAluno;
		int contNota;
		Scanner leia = new Scanner(System.in);

		for (contAluno = 0; contAluno <= 29; contAluno++) {
			for (contNota = 1; contNota <= 5; contNota++) {
				System.out.print("Digite a nota: " + contNota + " Do aluno " + 
			(contAluno + 1)  + ": ");
				notas = leia.nextFloat();

				somadasnotas = somadasnotas + notas;
			}

			mediaNotas[contAluno] = somadasnotas / 5;
			somamedias = somamedias + mediaNotas[contAluno];
			somadasnotas = 0;

		}
		
		System.out.println("Numero do Aluno       media aluno");
		for (byte x = 0; x <= 29; x++) {
			System.out.println( "     " + (x + 1) + "              " 
					+ mediaNotas[x] );
		}
		
		System.out.println("Media da turma: " +  somamedias / 5);
	}

}
