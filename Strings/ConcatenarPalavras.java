package Strings;

import java.util.Scanner;

public class ConcatenarPalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        String resultado = palavra1 + palavra2;

        System.out.println("A palavra resultante da concatenação é: " + resultado);

        scanner.close();
    }
}
