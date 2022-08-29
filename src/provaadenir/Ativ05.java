package provaadenir;

import java.util.Scanner;
import java.text.DecimalFormat;
//@author Adenir

public class Ativ05 {

    public static void main(String[] args) {
        DecimalFormat f = new DecimalFormat("#,##0.00");
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a quantidade de valores dos quais iremos calcular a média: ");
        int n = leia.nextInt();
        double acumulador = 0;
        while (n < 0) {
            System.out.println("Não é possível calcular a média de uma quantidade negativa de valores");
            System.out.println("");
            System.out.println("Digite a quantidade de valores dos quais iremos calcular a média: ");
            n = leia.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            System.out.println("");
            System.out.println("Digite o " + i + "° valor");
            double v = leia.nextDouble();
            acumulador = acumulador + v;
        }
        if (n == 0) {
            double Media = acumulador / 1;
            System.out.println("");
            System.out.println("A média de 0 valores digitados é: " + f.format(Media));
        } else {
            double Media = acumulador / n;
            System.out.println("");
            System.out.println("A média dos valores obtidos é: " + f.format(Media));
        }
    }
}
