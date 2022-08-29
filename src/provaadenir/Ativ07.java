package provaadenir;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ativ07 {

    public static void main(String[] args) {
        DecimalFormat f = new DecimalFormat("#,##0.00");
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o Valor da Compra\n(Lembre-se que esta deve ser maior ou igual à ZERO(0))");
        double C = leia.nextDouble();
        double R = 0;
        int D = 0;
        while (C <= 0) {
            System.out.println("Não é possível realizar uma compra menor ou igual à ZERO, digite um valor válido maior que ZERO (0)!!!");
            System.out.println("");
            System.out.println("Digite o Valor da Compra\n(Lembre-se que esta deve ser maior ou igual à ZERO(0))");
            C = leia.nextDouble();
        }
        if (C >= 5000) {
            R = C * 0.80;
            D = 20;
        } else {
            R = C * 0.85;
            D = 15;
        }
        System.out.println("");
        System.out.println("O valor da compra sem o desconto foi de R$ "+f.format(C)+" , o valor do Desconto foi de "+D+"% e o valor da Compra com o Desconto foi de R$ "+f.format(R)+".");
    }
}
