package fabricio.paiva.exercicios.cap2;
import java.util.Scanner;

public class Ex2_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;

        System.out.print("Informe o primeiro numero: ");
        n1 = input.nextInt();

        System.out.print("Informe o segundo numero: ");
        n2 = input.nextInt();

        if(n1 > n2)
            System.out.printf("%d is larger%n", n1);
        if(n1 < n2)
            System.out.printf("%d is larger", n2);
        if(n1 == n2)
            System.out.print("These numbers are equal");

        input.close();
    }
}
