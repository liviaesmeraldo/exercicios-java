package FormulasMatematicas;

public class MediaAritimetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        double media = (numero1 + numero2) / 2;

        System.out.println("A média aritimética dos números é: " + media);

        scanner.close();
    }
}
