import java.util.*;
public class exercicio1_4 {
	public static void main(String[] args) {
		
		// variaveis
		
		float km;
		float horas;
		float kmh;
		Scanner leia = new Scanner(System.in);
		
		//entrada
		
		System.out.print("digite os km: ");
		km = leia.nextFloat();
		System.out.print("digite as horas: ");
		horas = leia.nextFloat();
		
		// calculo
		
		kmh = km/horas;
		
		// saida
		
		System.out.println("os Km/h são: " + kmh + (" km/h") );
		
	}

}
