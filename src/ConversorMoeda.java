import java.util.Scanner;

public class ConversorMoeda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de Moeda");
        System.out.println("1 - Real (BRL) para Dólar (USD)");
        System.out.println("2 - Dólar (USD) para Real (BRL)");
        System.out.println("3 - Real (BRL) para Euro (EUR)");
        System.out.println("4 - Euro (EUR) para Real (BRL)");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();

        double resultado = 0;

        switch (opcao) {
            case 1:
                resultado = valor / 5.27; // Considerando 1 USD = 5.27 BRL
                System.out.printf("%.2f BRL é igual a %.2f USD\n", valor, resultado);
                break;
            case 2:
                resultado = valor * 5.27; // Considerando 1 USD = 5.27 BRL
                System.out.printf("%.2f USD é igual a %.2f BRL\n", valor, resultado);
                break;
            case 3:
                resultado = valor / 6.12; // Considerando 1 EUR = 6.12 BRL
                System.out.printf("%.2f BRL é igual a %.2f EUR\n", valor, resultado);
                break;
            case 4:
                resultado = valor * 6.12; // Considerando 1 EUR = 6.12 BRL
                System.out.printf("%.2f EUR é igual a %.2f BRL\n", valor, resultado);
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
