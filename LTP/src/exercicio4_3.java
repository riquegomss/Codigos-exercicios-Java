import java.util.*;
public class exercicio4_3 {
	public static void main(String[] args) {
		
		// variaveis
		
		float altura = 0;
		char sexo;
		float maioraltura = 0;
		float menoraltura = 3;
		float somaaltura;
		float contfem;
		float contmas;
		float somamasc;
		float somafem;
		Scanner leia = new Scanner(System.in);

		do {
			
			while(altura < 2.5 ) {
				System.out.print("Digite a Altura: ");
				altura = leia.nextFloat();
				if (altura == 0) {
					break;
					System.out.print("Invalido Digite novamente: ");
					
				} 
			}
			
			do {
				System.out.print("Digite o Sexo: ");
				sexo = leia.next().charAt(0);
				if (sexo == 'M' || sexo == 'F' ) {
					System.out.println("Sexo Errado!");
				}
				
			} while (sexo != 'M' && sexo != 'F');
			
			
		} while (condition);

			

	}

}
