import java.util.*;
public class exercicio2_2 {
	public static void main(String[] args) {
		
		//variaveis
		
		byte diaNasc;
		byte mesNasc;
		int anoNasc;
		byte diahj;
		byte meshj;
		int anohj;
		int idade;
		Scanner leia = new Scanner(System.in);
		//entrada
		
		System.out.print("Digite o dia de nascimento: ");
		diaNasc = leia.nextByte();
		System.out.print("Digite o mes de nascimento: ");
		mesNasc = leia.nextByte();
		System.out.print("Digite o ano de nascimento: ");
		anoNasc = leia.nextInt();
		System.out.print("Digite o dia de hoje: ");
		diahj = leia.nextByte();
		System.out.print("Digite o mes de hoje: ");
		meshj = leia.nextByte();
		System.out.print("Digite o ano de hoje: ");
		anohj = leia.nextInt();
		
		//calculo
		
		idade = (int) (anohj -anoNasc) ;
		
		
		if (diahj < diaNasc && meshj < mesNasc ) {
			idade = idade -1;
		
		} else {
		     
		}
		
		System.out.println("sua idade: " + idade);
		
	
	

	}

}
