package FormulasMatematicas;

import java.util.Scanner;

public class CalculadoraImc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura em metros:");
        double altura = scanner.nextDouble();

        double imc = peso / (altura*altura);

        System.out.println("O IMC é: " + imc);

        scanner.close();
    }
    
}
