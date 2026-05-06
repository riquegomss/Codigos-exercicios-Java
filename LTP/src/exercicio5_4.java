import java.util.*;
public class exercicio5_4 {
	public static void main(String[] args) {

		char gabarito[] = new char[10];
		int matriculaAluno;
		char resposta;
		byte nota = 0;
		int contAprovado = 0;
		int contAluno = 0;
		int maiorFreqAbs = 0;
		byte notaMaiorFreqAbs = 0;
		int freqAbsouta[] = new int[11];
		Scanner leia = new Scanner(System.in);

		for (byte x = 0; x <= 9; x++) {
			System.out.println("Digite a Letra da questão "  + (x + 1) + " no gabarito: ");
			gabarito[x] = leia.next().charAt(0);
			
		}

		do {
			System.out.println("Digite a matricula do aluno: ");
			matriculaAluno = leia.nextInt();
			if(matriculaAluno == 999) {
				break;
			}
			for(byte cont = 0; cont <= 9; cont++ ) {
				System.out.println("Digite a resposta da questão " + (cont+1));
				resposta = leia.next().charAt(0);
				if (resposta == gabarito[cont]) {
					nota++;
				}
			}
			
			if(nota >= 6) {
				contAprovado ++;
			}
			contAluno ++;
			freqAbsouta[nota] ++;
			System.out.println("A nota do aluno é: " + nota);
			nota = 0;
		} while(matriculaAluno != 999);
		
		System.out.println("Percentual de alunos aprovados: " + contAprovado * 100 / (float) contAluno);
		for(byte x = 0; x <= 10; x++) {
			if(freqAbsouta[x] > maiorFreqAbs) {
				maiorFreqAbs = freqAbsouta[x];
				notaMaiorFreqAbs = x;
			}
			System.out.println("A nota que apareceu com maior frequência foi: " + notaMaiorFreqAbs);
		}
	}

}
