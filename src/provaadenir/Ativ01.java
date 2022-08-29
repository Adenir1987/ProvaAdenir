package provaadenir;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ativ01 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o Código da Cor: ");
        String cor = leia.nextLine();
        System.out.println("");
        switch (cor) {
            case "Azor4":
                System.out.print("A Cor escolhida é ");
                System.out.println("Rosa");
                break;
            case "PTR##":
                System.out.print("A Cor escolhida é ");
                System.out.println("Azul");
                break;
            case "ASPO0":
                System.out.print("A Cor escolhida é ");
                System.out.println("Violeta");
                break;
            case "23":
                System.out.print("A Cor escolhida é ");
                System.out.println("Preto");
                break;
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                System.out.print("A Cor escolhida é ");
                System.out.println("Tom de azul");
                break;
            case "Ar43":
                System.out.print("A Cor escolhida é ");
                System.out.println("Vermelho");
                break;
            case "A":
            case "B":
            case "C":
            case "D":
            case "E":
            case "F":
                System.out.print("A Cor escolhida é ");
                System.out.println("Cinza");
                break;
            case "HP659T":
                System.out.print("A Cor escolhida é ");
                System.out.println("Amarelo");
                break;
            default:
                System.out.println("Digite um dos códigos Válidos:\nAzor4;\nPTR##;\nASPO0;\n23;\n5 a 9;\nAr43;\nDe A até F;\nHP659T;");
                break;
        }
    }
}
