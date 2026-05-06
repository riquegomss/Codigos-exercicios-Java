import java.util.*;
public class exercicio8_3 {
    static String[] vetCidades = {
        "BELO HORIZONTE",
        "SÃO PAULO",
        "RIO DE JANEIRO",
        "SALVADOR",
        "CURITIBA"
    };
    public static void main(String[] args) {
        String nomeHospede[] = new String[100];
        float valorConta[] = new float[100];
        int diaEntrada, diaSaida;
        String tipodeQuarto, cidadeHotel;
        int cont = 0;
        Scanner leia = new Scanner(System.in);
        do {
            System.out.print("Digite o nome do Hospede (fim para encerrar): ");
            nomeHospede[cont] = leia.nextLine();
            if (nomeHospede[cont].equalsIgnoreCase("fim")) {
                break;
            }
            System.out.print("Digite o dia de entrada: ");
            diaEntrada = leia.nextInt();
            do {
                System.out.print("Digite o dia de saída: ");
                diaSaida = leia.nextInt();
                if (diaSaida <= diaEntrada) {
                    System.out.println("Dia de saída deve ser maior que o dia de entrada!");
                }
            } while (diaSaida <= diaEntrada);
            leia.nextLine();
            do {
                System.out.print("Digite o tipo do quarto: ");
                tipodeQuarto = leia.nextLine();
                if (!tipodeQuarto.equalsIgnoreCase("standard") &&
                    !tipodeQuarto.equalsIgnoreCase("luxo") &&
                    !tipodeQuarto.equalsIgnoreCase("super-luxo")) {
                    System.out.println("Tipo de quarto inválido!");
                }
            } while (!tipodeQuarto.equalsIgnoreCase("standard") &&
                     !tipodeQuarto.equalsIgnoreCase("luxo") &&
                     !tipodeQuarto.equalsIgnoreCase("super-luxo"));
            do {
                System.out.print("Digite a cidade do hotel: ");
                cidadeHotel = leia.nextLine();

                if (!cidadeEhValida(cidadeHotel)) {
                    System.out.println("Cidade inválida!");
                }
            } while (!cidadeEhValida(cidadeHotel));
            
            valorConta[cont] = calcularConta(diaEntrada, diaSaida, tipodeQuarto);
            System.out.println("Valor da conta: " + valorConta[cont]);
            cont++;
        } while (true);
        float soma = 0;
            soma += valorConta[cont];
            

        float media = soma / (cont + 1 );
        System.out.println("Relatório de contas acima da média");
        System.out.println("Nome do hóspede       Vlr Conta");
        System.out.println("---------------------------------------");

        for (int i = 0; i < cont; i++) {
            if (valorConta[i] > media) {
                System.out.println(nomeHospede[i] + "    " + valorConta[i]);
            }
        }
    }
    public static boolean cidadeEhValida(String cidadeDigitada) {
        for (int i = 0; i < vetCidades.length; i++) {
            if (vetCidades[i].equalsIgnoreCase(cidadeDigitada)) {
                return true;
            }
        }
        return false;
    }
    public static float calcularConta(int diaEntrada, int diaSaida, String tipoQuarto) {
        float valorDiaria;
        if (tipoQuarto.equalsIgnoreCase("standard")) {
            valorDiaria = 120;
        } else if (tipoQuarto.equalsIgnoreCase("luxo")) {
            valorDiaria = 150;
        } else {
            valorDiaria = 180;
        }
        return (diaSaida - diaEntrada) * valorDiaria;
    }
}