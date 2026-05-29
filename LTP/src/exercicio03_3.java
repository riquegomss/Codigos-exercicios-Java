import java.util.*;	
public class exercicio3_3 {
	public static void main(String[] args) {
		
		// variaveis
		char tipodovinho = ' ';
		int cont = 0;
		int contTana = 0;
		int contMalbec = 0;
		int contCabe = 0;
		Scanner leia = new Scanner(System.in);
		
		while (tipodovinho != 'F') {
			System.out.println("Digite o tipo de vinho (T, M ou C)(F para finalizar): ");
			tipodovinho = leia.next().charAt(0);
			
			if(tipodovinho == 'F') {
				break;
			}
			
			if (tipodovinho == 'T') {
				contTana ++;
			} else if ( tipodovinho == 'C') {
				contCabe ++;
			} else {
				contMalbec ++;
			}
			
			cont ++;
					
		}
		
		System.out.println("quantidade total de vinhos: " + cont);
		System.out.println("quantidade total de tana:" + contTana);
		System.out.println("quantidade total de Cabenet:" + contCabe);
		System.out.println("quantidade total de Malbec:" + contMalbec);
		
		

	}

}
