package provaadenir;

import java.util.Scanner;
import java.text.DecimalFormat;
//@author Adenir

public class Ativ03 {

    public static void main(String[] args) {
        DecimalFormat f = new DecimalFormat("#,##0.00");
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o nome do(a) Funcionário(a): ");
        String nomeFuncionario = leia.nextLine();
        System.out.println("");
        System.out.println("Digite o Salário Atual do(a) Funcionário(a) " + nomeFuncionario + "\n(Lembre-se que este deve ser maior ou igual à ZERO(0))");
        double S = leia.nextDouble();
        double R = 0;
        while (S <= 0) {
            System.out.println("Não é possível o recebimento de um Salário menor ou igual à ZERO, digite um valor válido maior que ZERO (0)!!!");
            System.out.println("");
            System.out.println("Digite o Salário Atual do(a) Funcionário(a) " + nomeFuncionario);
            S = leia.nextDouble();
        }
        System.out.println("");
        System.out.println("Digite o tempo de Empresa em Anos Inteiros do(a) Funcionário(a) " + nomeFuncionario + "\n(Lembre-se que é impossível um tempo de trabalho em anos negativo!!!)");
        int A = leia.nextInt();
        while (A < 0) {
            System.out.println("Não é possível um tempo de trabalho negativo, digite um valor válido maior ou igual à ZERO (0)!!!");
            System.out.println("");
            System.out.println("Digite o tempo de Empresa em Anos Inteiros do(a) Funcionário(a) " + nomeFuncionario + "\n(Lembre-se que é impossível um tempo de trabalho em anos negativo!!!)");
            A = leia.nextInt();
        }
        if (A <= 4) {
            R = S * 1.10;
        } else if (A <= 9) {
            R = S * 1.15;
        } else if (A <= 14) {
            R = S * 1.20;
        } else if (A <= 19) {
            R = S * 1.25;
        } else {
            R = S * 1.30;
        }
        System.out.println("");
        System.out.println("Funcionário(a):" + nomeFuncionario + ",\nSalário: R$" + S + " foi dado como entrada,\nTempo de Empresa: " + A + " anos,\nO novo Salário de " + nomeFuncionario + " é de R$" + f.format(R) + ".");
    }
}
