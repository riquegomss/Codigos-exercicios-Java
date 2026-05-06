import java.util.*;
public class exercicio1_5 {
	public static void main(String[] args) {
		
		// variaveis
		
		float pes;
		float polegada;
		float jarda;
		float milha;
		float centimetro;
		Scanner leia = new Scanner(System.in);
		
		// entrada
		
		System.out.print("digite o valor em Pés: ");
		pes = leia.nextFloat();
		
		//calculo
		
		polegada = pes * 12;
		centimetro = (polegada * (float) 2.54);
		jarda = pes / 3;
		milha = jarda / 1760;
		
		// saida
		
		System.out.println("polegada: " + polegada);
		System.out.println("centimetros: " + centimetro);
		System.out.println("jarda: " + jarda);
		System.out.println("milha: " + milha);
		
	}
}
