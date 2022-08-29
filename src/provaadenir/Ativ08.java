package provaadenir;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ativ08 {

    public static void main(String[] args) {
        DecimalFormat f = new DecimalFormat("#,##0.00");
        Scanner leia = new Scanner(System.in);
        System.out.println("Selecione um das opções de frutas disponíveis:\n1 - banana (R$ 5,45/Kg);\n2 - maça (R$ 4,23/Kg);\n3 - laranja (R$ 3,19/Kg);\n4 - kiwi (R$ 2,11/Kg);\n5 - pêssego (R$ 6,21/Kg);");
        String comprou = "nada";
        int fruta = leia.nextInt();
        double preco = 0;
        while ((fruta <= 0) || (fruta >= 6)) {
            System.out.println("Não é possível o recebimento de uma alternativa diferente das opções 1, 2, 3, 4 ou 5!");
            System.out.println("");
            System.out.println("Selecione um das opções de frutas disponíveis:\n1 - banana;\n2 - maça;\n3 - laranja;\n4 - kiwi;\n5 - pêssego;");
            fruta = leia.nextInt();
        }
        switch (fruta) {
            case 1:
                comprou = "banana";
                preco = 5.45;
                break;
            case 2:
                comprou = "maçã";
                preco = 4.23;
                break;
            case 3:
                comprou = "laranja";
                preco = 3.19;
                break;
            case 4:
                comprou = "kiwi";
                preco = 2.11;
                break;
            case 5:
                comprou = "pêssego";
                preco = 6.21;
                break;
        }
        System.out.println("");
        System.out.println("Quantos Kg de " + comprou + " você gostaria de comprar?");
        double quantidade = leia.nextDouble();
        double total = preco * quantidade;
        System.out.println("");
        System.out.println("Você comprou " + f.format(quantidade) + " Kg de " + comprou + " e o valor total da compra foi de R$ " + f.format(total) + ".");
    }
}
