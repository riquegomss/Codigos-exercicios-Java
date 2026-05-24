import java.util.*;
public class exercicio9_1 {
	public static void main(String[] args) {
		
		String DataAtual;
		String dataNascimento;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a data nascimento: ");
		dataNascimento = leia.next();
		System.out.println("Digite a data do ano atual: ");
		DataAtual = leia.next();
		System.out.println("Idade: " + calcularidade(dataNascimento, DataAtual));
		
		
	}
	public static int calcularidade (String dataNascimento, String dataAtual) {
		
		String DiaHjSTR;
		String MesHjSTR;
		String AnoHjSTR;
		
		int anoHoje;
		int anoNasc;
		int mesHoje;
		int mesNasc;
		int diaNasc;
		int diaHoje;
		
		DiaHjSTR = dataAtual.substring(0, 2);
		MesHjSTR = dataAtual.substring(3, 5);
		AnoHjSTR = dataAtual.substring(6);
		
		diaHoje = Integer.parseInt(dataAtual.substring(0, 2));
		mesHoje = Integer.parseInt(dataAtual.substring(3, 5));
		anoHoje = Integer.parseInt(dataAtual.substring(6));
		
		diaNasc = Integer.parseInt(dataAtual.substring(0, 2));
		mesNasc = Integer.parseInt(dataAtual.substring(3, 5));
		anoNasc = Integer.parseInt(dataAtual.substring(6));
		
        int idade = anoHoje - anoNasc;
		return idade;
	}

}
