import java.util.*;
public class exercicio5_5 {
	public static void main(String[] args) {

		// variaveis
		
		String nome;
		int nota;
		String sexoStr;
		char sexo;
		String nomesAprovados[] = new String[50];
		int notasAprovados[] = new int[50];
		int contAluno;
		int contAprovados = 0;
		int aprovadosMasc = 0;
		int reprovadasFem = 0;
		int contFem = 0;
		float somaNotasGeral = 0;
		float somaNotasFem = 0;
		Scanner leia = new Scanner(System.in);
		
		for (contAluno = 0; contAluno <= 2; contAluno++) {
			System.out.print("Digite o nome do aluno " + (contAluno + 1) + ": ");
			nome = leia.nextLine();
			nota = -1;
			while (nota < 0 || nota > 100) {
				System.out.print("Digite a nota (0 a 100): ");
				nota = leia.nextInt();
			}
			sexo = ' ';
			while (sexo != 'M' && sexo != 'F') {
				System.out.print("Digite o sexo (M ou F): ");
				sexoStr = leia.next();
				sexo = sexoStr.toUpperCase().charAt(0);
			}
			leia.nextLine(); 
			somaNotasGeral = somaNotasGeral + nota;

			if (sexo == 'F') {
				somaNotasFem = somaNotasFem + nota;
				contFem++;
			}
			if (nota >= 60) {
				System.out.println("Status: APROVADO\n");
				
				if (sexo == 'M') {
					aprovadosMasc++;
				}
				nomesAprovados[contAprovados] = nome;
				notasAprovados[contAprovados] = nota;
				contAprovados++;
				
			} else {
				System.out.println("Status: REPROVADO\n");
				
				if (sexo == 'F') {
					reprovadasFem++;
				}
			}
		}
		
		System.out.println("O numero de aprovacoes do sexo masculino: " + aprovadosMasc);
		System.out.println("O numero de reprovacoes do sexo feminino: " + reprovadasFem);
		
		if (contFem > 0) {
			System.out.println("A media das notas femininas: " + (somaNotasFem / contFem));
		} else {
			System.out.println("A media das notas femininas: 0");
		}
		
		System.out.println("A media geral das notas: " +  (somaNotasGeral / 3));
		
		System.out.println("\nRELATÓRIO DE APROVADOS");
		System.out.println("NOME               NOTA");
		for (byte x = 0; x <= (contAprovados - 1); x++) {
			System.out.println(nomesAprovados[x] + "               " + notasAprovados[x] );
		}
		
	}
}