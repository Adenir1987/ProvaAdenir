package provaadenir;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Adenir
 */
public class Ativ04 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Selecione o Prato Principal:\n1 - Vegetariano;\n2 - Carne;\n3 - Frango;\n4 - Peixe;");
        int prato = leia.nextInt();
        int cal1 = 0;
        int cal2 = 0;
        int cal3 = 0;
        while ((prato <= 0) || (prato >= 5)) {
            System.out.println("Não é possível o recebimento de uma alternativa diferente das opções 1, 2, 3 ou 4");
            System.out.println("");
            System.out.println("Selecione o Prato Principal:\n1 - Vegetariano;\n2 - Carne;\n3 - Frango;\n4 - Peixe;");
            prato = leia.nextInt();
        }
        switch (prato) {
            case 1:
                cal1 = 180;
                break;
            case 2:
                cal1 = 360;
                break;
            case 3:
                cal1 = 230;
                break;
            case 4:
                cal1 = 200;
                break;
        }
        System.out.println("");
        System.out.println("Selecione a Sobremesa:\n1 - Morango;\n2 - Sorvete;\n3 - Mouse chocolate;\n4 - Sagu;");
        int sobremesa = leia.nextInt();
        while ((sobremesa <= 0) || (sobremesa >= 5)) {
            System.out.println("Não é possível o recebimento de uma alternativa diferente das opções 1, 2, 3 ou 4");
            System.out.println("");
            System.out.println("Selecione a Sobremesa:\n1 - Morango;\n2 - Sorvete;\n3 - Mouse chocolate;\n4 - Sagu;");
            sobremesa = leia.nextInt();
        }
        switch (sobremesa) {
            case 1:
                cal2 = 30;
                break;
            case 2:
                cal2 = 180;
                break;
            case 3:
                cal2 = 210;
                break;
            case 4:
                cal2 = 75;
                break;
        }
        System.out.println("");
        System.out.println("Selecione a Bebida:\n1 - Cerveja;\n2 - Suco;\n3 - Refrigerante;\n4 - Refri Diet;");
        int bebida = leia.nextInt();
        while ((bebida <= 0) || (bebida >= 5)) {
            System.out.println("Não é possível o recebimento de uma alternativa diferente das opções 1, 2, 3 ou 4");
            System.out.println("");
            System.out.println("Selecione a Bebida:\n1 - Cerveja;\n2 - Suco;\n3 - Refrigerante;\n4 - Refri Diet;");
            bebida = leia.nextInt();
        }
        switch (bebida) {
            case 1:
                cal3 = 140;
                break;
            case 2:
                cal3 = 100;
                break;
            case 3:
                cal3 = 600;
                break;
            case 4:
                cal3 = 50;
                break;
        }
        System.out.println("");
        System.out.println("O total de calorias da refeição escolhida é de " + (cal1 + cal2 + cal3) + " calorias.");
    }
}
