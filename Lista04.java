import java.util.Scanner;

public class Lista04 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o preço do litro da gasolina: ");
    double precoLitro = scanner.nextDouble();

    System.out.println("Digite a quantidade de litros vendida: ");
    double Litros = scanner.nextDouble();

    double total = precoLitro * Litros;

    System.out.println("O valor a pagar é: R$ " + total);

    scanner.close();
   }
}
