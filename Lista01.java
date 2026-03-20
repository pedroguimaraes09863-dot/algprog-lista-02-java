import java.util.Scanner;

public class Lista01 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Digite um número: ");
      int numero = scanner.nextInt();

      System.out.print("O número informado foi " + numero);

      scanner.close();
    }
}