
import java.util.Scanner;

public class VerificarOrdemCrescente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = input.nextInt();

        int [] vetor = new int [tamanho];

        System.out.println("Digite os elementos do vetor: ");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = input.nextInt();
        }

        boolean estaEmOrdemCrescente = true;

        for (int i = 0; i < tamanho; i++) {
            if (vetor [i] > vetor[i +1]) {
                estaEmOrdemCrescente = false;
                break;
            }
        }
        if (estaEmOrdemCrescente) {
            System.out.println("O vetor está em ordem crescente");
           
        } else {
            System.out.println("O vetor não está em ordem crescente"); 
        }
        input.close();
    }
    
}
