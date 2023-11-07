package Condicionais;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println("0 número é par.");
        } else {
            System.out.println("O número é ímpar");
        
        }
        scanner.close();
    }
    
}
