package provaadenir;

import java.util.Scanner;

public class Ativ06 {

    public static void main(String[] args) {
        int m1[][] = new int[2][2];
        int m2[][] = new int[2][2];
        Scanner leia = new Scanner(System.in);
        m1[0][0] = 1;
        m1[0][1] = 5;
        m1[1][0] = 6;
        m1[1][1] = 9;

        m2[0][0] = 3;
        m2[0][1] = 7;
        m2[1][0] = 2;
        m2[1][1] = 4;

        System.out.println("A matriz Resultante de m1 e m2 é: ");
        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                System.out.print((m1[linha][coluna]+m2[linha][coluna]) + "\t");
            }
            System.out.println("");
        }
    }
}
