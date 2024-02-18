import java.util.Scanner;

public class SomaDiagonalPrincipal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] [] matriz = new int[3][3];

        System.out.println("Digite os valores da matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o valor da posição[" + i + "] [" + j + "]");
                matriz[i] [j] = input.nextInt();
            }
        }
        int SomaDiagonal = 0;
        for (int i = 0; i < 3; i++) {
            SomaDiagonal += matriz[i] [i];
        }
        System.out.println("A soma dos valores da diagonal principal é:" + SomaDiagonal);

        input.close();
    }

}