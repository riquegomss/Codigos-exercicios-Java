import java.util.*;
public class exercicio5_3 {
	public static void main(String[] args) {

		byte matricLtp[] = new byte[150];
		byte matriCal;
		byte contLTP;
		byte contCal;
		byte contmatri_cal_LTP;
		Scanner leia = new Scanner(System.in);

		for (contLTP = 0; contLTP == 149; contLTP++) {
			System.out.println("Digite a matricula dos alunos de LTP: ");
			matricLtp[contLTP] = leia.nextByte();			
			if(matricLtp[contLTP] == 999) {
				break;
			}
		}
		
		for(contCal = 1; contCal <= 220; contCal ++) {
			System.out.println("Digite a matricula em calculo: ");
			matriCal = leia.nextByte();
			if(matriCal == 999) {
				break;
			}
		}
		for(int x = 0; x < contLTP; x++){
			
		
			
 {
				
				
			}
		}
	}
}
