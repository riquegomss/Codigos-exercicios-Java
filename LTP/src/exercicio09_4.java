import java.util.*;
import java.time.Year;

public class exercicio9_4 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String placa;
        String data;
        double valor;
        double soma = 0;
        double menor = 0;
        int quantidade = 0;
        char continuar = 'S';

        while (continuar == 'S' || continuar == 's') {

            do {
                System.out.print("Digite a placa do veículo: ");
                placa = leia.nextLine().toUpperCase();
            } while (!placa.matches("[A-Z]{3}[0-9]{4}"));

            do {
                System.out.print("Digite a data da multa (DD/MM/AAAA): ");
                data = leia.nextLine();
            } while (!dataEhValida(data));

            do {
                System.out.print("Digite o valor da multa: ");
                valor = leia.nextDouble();
            } while (valor <= 0);

            leia.nextLine();

            soma += valor;

            if (quantidade == 0 || valor < menor) {
                menor = valor;
            }

            quantidade++;

            System.out.print("Deseja continuar? (S/N): ");
            continuar = leia.nextLine().charAt(0);
        }

        double media = soma / quantidade;

        System.out.println("\nRESULTADOS");
        System.out.println("Soma das multas: R$ " + soma);
        System.out.println("Média das multas: R$ " + media);
        System.out.println("Menor multa: R$ " + menor);

        leia.close();
    }

    public static boolean dataEhValida(String data) {

        if (data.length() != 10) {
            return false;
        }

        if (data.charAt(2) != '/' || data.charAt(5) != '/') {
            return false;
        }

        if (!data.matches("\\d{2}/\\d{2}/\\d{4}")) {
            return false;
        }

        int dia = Integer.parseInt(data.substring(0, 2));
        int mes = Integer.parseInt(data.substring(3, 5));
        int ano = Integer.parseInt(data.substring(6, 10));

        if (mes < 1 || mes > 12) {
            return false;
        }

        int anoAtual = Year.now().getValue();

        if (ano > anoAtual) {
            return false;
        }

        boolean bissexto;

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            bissexto = true;
        } else {
            bissexto = false;
        }

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 ||
            mes == 8 || mes == 10 || mes == 12) {

            return dia >= 1 && dia <= 31;
        }

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {

            return dia >= 1 && dia <= 30;
        }

        if (bissexto) {
            return dia >= 1 && dia <= 29;
        } else {
            return dia >= 1 && dia <= 28;
        }
    }
}