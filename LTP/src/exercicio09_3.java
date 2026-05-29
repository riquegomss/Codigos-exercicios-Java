import java.util.*;

public class exercicio9_3 {

    public static boolean horaEhValida(String hora) {

        if (hora.length() != 5 || hora.charAt(2) != ':') {
            return false;
        }

        try {
            int hh = Integer.parseInt(hora.substring(0, 2));
            int mm = Integer.parseInt(hora.substring(3, 5));

            if (hh >= 0 && hh <= 23 && mm >= 0 && mm <= 59) {
                return true;
            }

        } catch (Exception e) {
            return false;
        }

        return false;
    }

    public static int converterMinutos(String hora) {

        int hh = Integer.parseInt(hora.substring(0, 2));
        int mm = Integer.parseInt(hora.substring(3, 5));

        return (hh * 60) + mm;
    }

    public static double valorMinuto(String hora) {

        int hh = Integer.parseInt(hora.substring(0, 2));

        if (hh >= 0 && hh <= 5) {
            return 0.10;
        } else if (hh >= 6 && hh <= 7) {
            return 0.15;
        } else if (hh >= 8 && hh <= 17) {
            return 0.20;
        } else {
            return 0.15;
        }
    }

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String horarioIni;
        String horarioFim;
        double totalConta = 0;
        int flag;

        do {

            System.out.println("Digite o horario inicial da chamada (HH:MM): ");
            horarioIni = leia.next();

            while (!horaEhValida(horarioIni)) {
                System.out.println("Horario invalido. Digite novamente: ");
                horarioIni = leia.next();
            }

            System.out.println("Digite o horario final da chamada (HH:MM): ");
            horarioFim = leia.next();

            while (!horaEhValida(horarioFim)) {
                System.out.println("Horario invalido. Digite novamente: ");
                horarioFim = leia.next();
            }

            int minutosIni = converterMinutos(horarioIni);
            int minutosFim = converterMinutos(horarioFim);

            while (minutosFim <= minutosIni) {
                System.out.println("Horario final deve ser maior que o inicial.");
                System.out.println("Digite novamente o horario final: ");
                horarioFim = leia.next();

                while (!horaEhValida(horarioFim)) {
                    System.out.println("Horario invalido. Digite novamente: ");
                    horarioFim = leia.next();
                }

                minutosFim = converterMinutos(horarioFim);
            }

            int duracao = minutosFim - minutosIni;

            double valorMin = valorMinuto(horarioIni);

            double custo = duracao * valorMin;

            totalConta += custo;

            System.out.printf("Duracao da chamada: %d minutos\n", duracao);
            System.out.printf("Custo da chamada: R$ %.2f\n", custo);

            System.out.println("Deseja adicionar outra chamada?");
            System.out.println("1 - Sim");
            System.out.println("0 - Nao");
            flag = leia.nextInt();

        } while (flag != 0);

        System.out.printf("TOTAL DA CONTA TELEFONICA: R$ %.2f\n", totalConta);

    }
}