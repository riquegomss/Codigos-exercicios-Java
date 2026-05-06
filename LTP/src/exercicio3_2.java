import java.util.*;
public class exercicio3_2 {
	public static void main(String[] args) {
		// variaveis
		
		int num;
		int fat = 1;
		Scanner leia = new Scanner(System.in);
		
		//entrada
		
		System.out.print("Digite o numero: ");
		num = leia.nextInt();
		
		while(num >= 1 ) {
			fat = fat * num--;
			
		}
		
		System.out.println("o valor do: " + fat );

	}

}
