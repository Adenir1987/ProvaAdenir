package provaadenir;

import java.util.Scanner;

public class Ativ02 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int vetor1[] = new int[5];
        int vetor2[] = new int[5];
        System.out.println("Digite os valores que irão preencher o 1º Vetor, sabendo que os valores negativos serão substituítos por 0 no 2° Vetor");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° valor:");
            vetor1[i] = leia.nextInt();
        }
        System.out.print("Os valores digitados do 1º Vetor são: [ \t");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(vetor1[i] + "\t");
            System.out.print("");
            if (vetor1[i] >= 0) {
                vetor2[i] = vetor1[i];
            } else {
                vetor2[i] = 0;
            }
        }
        System.out.println("]");
        System.out.print("Os valores do 2º Vetor com os valores negativos do 1° vetor substituídos são: [ \t");
        for (int j = 0; j < vetor1.length; j++) {
            System.out.print(vetor2[j] + "\t");
        }
        System.out.print("]");
    }
}
