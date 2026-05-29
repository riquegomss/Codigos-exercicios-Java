import java.util.*;
public class exercicio2_5 {
	public static void main(String[] args) {
		// variaveis
		
		float cand1_1;
		float cand1_2;
		float cand2_1;
		float cand2_2;
		float cand3_1;
		float cand3_2;
		float somac1;
		float somac2;
		float somac3;
		Scanner leia = new Scanner(System.in);
		//entrada
		
		System.out.print("digite a quantidade de votos cand1 1 secao: ");
		cand1_1 = leia.nextFloat();
		System.out.print("digite a quantidade de votos cand1 2 secao: ");
		cand1_2 = leia.nextFloat();
		System.out.print("digite a quantidade de votos cand2 1 secao: ");
		cand2_1 = leia.nextFloat();
		System.out.print("digite a quantidade de votos cand2 2 secao: ");
		cand2_2 = leia.nextFloat();
		System.out.print("digite a quantidade de votos cand3 1 secao: ");
		cand3_1 = leia.nextFloat();
		System.out.print("digite a quantidade de votos cand3 2 secao: ");
		cand3_2 = leia.nextFloat();
		
		//saida
		
		somac1 = cand1_1 + cand1_2;
		somac2 = cand2_1 + cand2_2;
		somac3 = cand3_1 + cand3_2;
		
		if(somac1 > somac2 && somac1 > somac3) {
			System.out.print(" candidato 1 vencedor");
		 
		} else if ( somac2 > somac3 && somac2 > somac3) {
			System.out.print(" candidato 2 vencedor");
		} else
			System.out.print(" candidato 3 vencedor");
			
		
		
	}
}
