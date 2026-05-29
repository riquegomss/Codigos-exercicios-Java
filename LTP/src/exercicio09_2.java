import java.util.*;

public class exercicio9_2 {

	public static void main(String[] args) {

		String codigo;
		Scanner leia = new Scanner(System.in);
		boolean valido;
		do {
			valido = true;
			System.out.println("Digite o codigo (11 digitos): ");
			codigo = leia.next();
			
			if(codigo.length() != 11) {
				valido = false;
			}
			for(int i = 0; i < codigo.length(); i++) {

				if(!Character.isDigit(codigo.charAt(i))) {
					valido = false;
				}
			}
			if(!valido) {
				System.out.println("Codigo Invalido, Digite novamente!");
			}
		} while(!valido);
		boolean resultado = verificadorCodigo(codigo);
		if(resultado) {
			System.out.println("Digito Correto");
		}
		else {
			System.out.println("Digito Invalido");
		}
	}
	
	public static boolean verificadorCodigo(String codigo) {
		
		int soma = 0;
		int multiplicacao = 1;

		for(int i = 0; i < 9; i++) {
			int numero = Character.getNumericValue(codigo.charAt(i));

			soma += numero;
			multiplicacao *= numero;
		}

		int dv1 = soma / 10;
		int dv2 = multiplicacao % 10;

		int digito10 = Character.getNumericValue(codigo.charAt(9));
		int digito11 = Character.getNumericValue(codigo.charAt(10));

		if(dv1 == digito10 && dv2 == digito11) {
			return true;
		}
		else {
			return false;
		}
	}
}