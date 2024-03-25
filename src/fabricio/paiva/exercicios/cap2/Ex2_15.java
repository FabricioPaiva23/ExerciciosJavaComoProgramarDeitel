package fabricio.paiva.exercicios.cap2;
import java.util.Scanner;

public class Ex2_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2, soma, produto, divisao, diferenca;

        System.out.print("Informe o primeiro numero: ");
        n1 = input.nextInt();

        System.out.print("Informe o segundo numero: ");
        n2 = input.nextInt();

        soma = n1 + n2;
        produto = n1 * n2;
        divisao = n1 / n2;
        diferenca = n1 - n2;

        System.out.printf("%d + %d = %d%n", n1, n2, soma);
        System.out.printf("%d - %d = %d%n", n1, n2, diferenca);
        System.out.printf("%d X %d = %d%n", n1, n2, produto);
        System.out.printf("%d / %d = %d%n", n1, n2, divisao);

        input.close();
    }
}
