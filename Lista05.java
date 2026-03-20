import java.util.Scanner;

public class Lista05 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        

        System.out.print("Digite o valor da viagem para a Alemanha: ");
        double alemanha = scanner.nextDouble();

        System.out.print("Digite o valor da viagem para Portugal: ");
        double portugal = scanner.nextDouble();

        System.out.print("Digite o valor da viagem para a Itália: ");
        double italia = scanner.nextDouble();

        double total = alemanha + portugal + italia;

        System.out.println("O custo total da eurotrip é: R$ " + total);

        scanner.close();
    }
}
