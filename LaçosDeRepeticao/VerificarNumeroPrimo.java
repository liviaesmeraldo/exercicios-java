package LaçosDeRepeticao;

import java.util.Scanner;

public class VerificarNumeroPrimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();

        boolean ehPrimo = true;

        if (numero <= 1) {
            ehPrimo = false;
        } else {
            for (int i =2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }
        if (ehPrimo) {
            System.out.println(numero + " é um número primo");
        } else {
            System.out.println(numero + " não é um número primo");    
        }
        input.close();
    }
    
}
