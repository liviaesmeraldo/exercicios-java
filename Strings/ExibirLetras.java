package Strings;

import java.util.Scanner;

public class ExibirLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra");
        String palavra = scanner.nextLine();

        for (int i = 0; i < palavra.length(); i ++){
            char letra = palavra.charAt(i);
            System.out.println(letra);

        }
        
        scanner.close();

    }
}
