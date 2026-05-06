import java.util.*;
public class exercicio4_2 {
    public static void main(String[] args) {
        
        int voto;
        int cand_1 = 0;
        int cand_2 = 0;
        int cand_3 = 0;
        int candnul = 0;
        int cand_branco = 0;
        Scanner leia = new Scanner(System.in);
        
        // entrada
        for (int x = 1; x <= 3; x++) {
            do {
				System.out.print("digite o voto" + x++ + ":");
				voto = leia.nextInt();
				if (voto <1 || voto > 5) {
					System.out.println("Voto invalido");
				}
			} while (voto < 1 || voto > 5);
            
            //calculo
            
            if (voto == 1) {
                cand_1++;
            } else if (voto == 2) {
                cand_2++;
            } else if (voto == 3) {
                cand_3++;
            } else if (voto == 4) {
                candnul++;
            } else {
                cand_branco++;
            }
        }

        // verificação do vencedor (fora do for)
        if (cand_1 > cand_2 && cand_1 > cand_3) {
            System.out.println("Candidato 1 vencedor!");
        } else if (cand_2 > cand_1 && cand_2 > cand_3) {
            System.out.println("Candidato 2 vencedor!");
        } else if (cand_3 > cand_1 && cand_3 > cand_2) {
            System.out.println("Candidato 3 vencedor!");
        } else {
            System.out.println("Empate!");
        }

        System.out.println("Brancos: " + cand_branco);
        System.out.println("Nulos: " + candnul);
    }
}