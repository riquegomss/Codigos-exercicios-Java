import java.util.*;
public class exercicio2_6 {
	public static void main(String[] args) {
		
		// variaveis
		
		float lado1;
		float lado2;
		float lado3;
		Scanner leia = new Scanner(System.in);
		
		// entrada
		
		System.out.print("digite o lado 1: ");
		lado1 = leia.nextFloat();
		System.out.print("digite o lado 2: ");
		lado2 = leia.nextFloat();
		System.out.print("digite o lado 3: ");
		lado3 = leia.nextFloat();
		
		//calculo
		
		if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
			System.out.print("nao e um triangulo");
		} else if ( lado1 == lado2 && lado2 == lado3) {
			System.out.print("triangulo equilatero");
		} else if (lado1 == lado2 && lado3 == lado2 && lado3 == lado1 ) {
			System.out.print("triangulo isoseles");
		} else {
			System.out.print("triangulo escaleno");
		}
		
		
		

	}

}
