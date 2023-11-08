package Vetores;

import java.util.Scanner;

public class SomaElementosVetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        System.out.print("Digite o tamanho do vetor: ");
        

        int [] vetor = new int[n];

        System.out.println("Digite os elementos do vetor: ");
        for (int i = 0; i < n; i++) {
            vetor[i] = input.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vetor[i];
        }
        System.out.println("A soma dos elementos é: " + soma);

        input.close();
    }
}
