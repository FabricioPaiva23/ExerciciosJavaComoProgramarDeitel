package fabricio.paiva.exercicios.cap2;
import java.util.Scanner;

public class Ex2_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");
        int n1 = input.nextInt();
        System.out.print("Informe o segundo numero: ");
        int n2 = input.nextInt();

        if (n1 % n2 == 0)
            System.out.printf("%d e multiplo de %d", n1, n2);

        input.close();
    }
}
