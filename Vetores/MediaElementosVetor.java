import java.util.Scanner;

public class MediaElementosVetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos: ");
        int quantidade = input.nextInt();

        int [] vetor = new int [quantidade];

        System.out.println("Digite os elementos do vetor: ");

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Elemento" + (i + 1) + ":");
            vetor[i] = input.nextInt();
        }
        int soma = 0;

        for (int i = 0; i < quantidade; i++) {
            soma += vetor[i];
        }
        double media = (double) soma / quantidade;

        System.out.println("A média dos elementos do vetor é:" + media);

        input.close();
    }
}
