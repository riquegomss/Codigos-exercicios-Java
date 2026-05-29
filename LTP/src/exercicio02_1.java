import java.util.*;
public class exercicio2_1 {

	public static void main(String[] args) {
		// variaveis
		
		byte idade;
		Scanner leia = new Scanner(System.in);
		
		//entrada
		System.out.print("Digite a idade: ");
		idade = leia.nextByte();
		
		//calculo
		
		if (idade >= 18) {
			System.out.print("voce e maior de idade!");
		} else { // idade <18
			System.out.println("voce e menor de idade!");
		}

	}

}
