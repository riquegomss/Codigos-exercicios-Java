import java.util.Scanner;
public class exercicio1_6 {
	public static void main(String[] args) {
		
		// Variaveis
		
		float deposito;
		float cheque1;
		float cheque2;
		float vlrtotal;
		Scanner leia =  new Scanner(System.in);
		
		// entrada
		
		System.out.print("Digite o valor do deposito: ");
		deposito = leia.nextFloat();
		System.out.print("Digite o valor dos cheques1: ");
		cheque1 = leia.nextFloat();
		System.out.print("Digite o valor dos cheques2: ");
		cheque2 = leia.nextFloat();
		
		//calculo 
		
		
		vlrtotal = deposito - cheque1 - (float) (0.02 / 100 * cheque1) - cheque2 - (float)(0.02 / 100 * cheque2) ;
		
		System.out.println("Saldo agora e: " + vlrtotal);
		
	}

}
