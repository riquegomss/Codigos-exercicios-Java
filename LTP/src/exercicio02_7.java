import java.util.*;
public class exercicio2_7 {
	public static void main(String[] args) {
		
		//variaveis
		
		float peso;
		float altura;
		float imc;
		float pesomi;
		float pesoma;
		Scanner leia = new Scanner(System.in);
		
		// entrada
		
		System.out.print("digite o peso: ");
		peso = leia.nextFloat();
		System.out.print("digite a altura: ");
		altura = leia.nextFloat();
		
		//calculo
		
		imc = peso / (altura * altura);
		pesomi = 20 * (altura * altura);
		pesoma = 25 * (altura * altura);
        

		if (imc < 20) {
			System.out.println("abaixo do peso ");
		} else if (imc >= 20 && imc <= 25) {
			System.out.println("peso ideal "); 
		}else {
			System.out.println("acima do peso ");
		}
		
		System.out.println("IMC: " + imc);
		System.out.println("peso minimo: " + pesomi);
		System.out.println("peso maximo: " + pesoma);
			
			
			
			
		
		
		
		

	}
}
