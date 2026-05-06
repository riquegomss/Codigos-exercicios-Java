import java.util.*;
public class exercicio8_2 {
    public static void main(String[] args) {
        String nome[] = new String[100];
        float salario[] = new float[100];
        int codigo;
        int pecas;
        int cont = 0;
        float totalSalarios = 0;
        Scanner leia = new Scanner(System.in);

        do {
            do {
                System.out.println("Digite o codigo do empregado 1-999 (0 encerra): ");
                codigo = leia.nextInt();
                if (codigo == 0) {
                    break;
                }
                if (codigo < 1 || codigo > 999) {
                    System.out.println("Codigo invalido!");
                }
            } while (codigo < 1 || codigo > 999);
            if (codigo == 0) {
                break;
            }
            leia.nextLine();
            System.out.println("Digite o nome do empregado: ");
            nome[cont] = leia.nextLine();
            
            do {
                System.out.println("Digite a quantidade de peças: ");
                pecas = leia.nextInt();

                if (pecas <= 0) {
                    System.out.println("Quantidade inválida!");
                }

            } while (pecas <= 0);
            
            salario[cont] = calcularSalario(pecas);
            totalSalarios += salario[cont];
            cont++;

            if (cont >= 100) {
                System.out.println("Limite de empregados atingido!");
                break;
            }

        } while (true);

        System.out.println("Nome             Salário");
        System.out.println("-----------------------------");

        for (int i = 0; i < cont; i++) {
            System.out.println(nome[i] + "              " + salario[i]);
        }

        float media = 0;
        if (cont > 0) {
            media = totalSalarios / cont;
        }
        System.out.println("  ");
        System.out.println("Total pago com salários:  " + totalSalarios);
        System.out.println("Média dos salários: " + media);
    }

    public static float calcularSalario(int pecas) {
        if (pecas <= 200) {
            return pecas * (float) 2.0;
        } else if (pecas <= 400) {
            return pecas * (float) 2.3;
        } else {
            return pecas * (float) 2.5;
        }
    }
}