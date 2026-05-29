import java.util.*;
public class exercicio2_8 {
	public static void main(String[] args) {
		
		// variaveis
		
		float tmpcasa;
		double salario;
		double bonus = 0;
		double desconto = 0;
		
		Scanner leia = new Scanner(System.in);
		
		// entrada
		
		System.out.print("Digite o Tempo de Casa: ");
		tmpcasa = leia.nextFloat();
		System.out.print("Digite o Salario: ");
		salario = leia.nextFloat();
		
		// calculo
		
		if (tmpcasa <= 5 && salario <= 300) {
            bonus = 50;
            desconto = salario * 0.05;

        } else if (tmpcasa <= 5 && salario > 300) {
            bonus = 80;
            desconto = salario * 0.06;

        } else if (tmpcasa <= 10 && salario <= 500) {
            bonus = salario * 0.15;
            desconto = 70;

        } else if (tmpcasa <= 10 && salario <= 2000) {
            bonus = salario * 0.13;
            desconto = 90;

        } else if (tmpcasa <= 10) {
            bonus = salario * 0.12;
            desconto = salario * 0.08;

        } else {
            bonus = 300;
            desconto = salario * 0.04;
        }
		// saida
		
		System.out.println("Bonus Salarial: R$ " + bonus);
		System.out.println("Vale Transporte: R$ " + desconto);
	}
}

// Henrique Gomes Soares