package provaadenir;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ativ10 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um valor Inteiro referente ao dia da Semana de 1 à 7: ");
        int dia = leia.nextInt();
        String escolha = "nada";
        while ((dia <= 0) || (dia >= 8)) {
            System.out.println("Não é possível o recebimento de uma alternativa diferente das opções 1, 2, 3, 4, 5, 6 ou 7");
            System.out.println("");
            System.out.println("Digite um valor Inteiro referente ao dia da Semana de 1 à 7: ");
            dia = leia.nextInt();
        }
        switch (dia) {
            case 1:
                escolha = "SEG";
                break;
            case 2:
                escolha = "TER";
                break;
            case 3:
                escolha = "QUA";
                break;
            case 4:
                escolha = "QUI";
                break;
            case 5:
                escolha = "SEX";
                break;
            case 6:
                escolha = "SÁB";
                break;
            case 7:
                escolha = "DOM";
                break;
        }
        System.out.println("");
        System.out.println(escolha);
    }
}
