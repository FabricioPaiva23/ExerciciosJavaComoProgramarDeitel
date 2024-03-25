package fabricio.paiva.exercicios.cap2;
import java.util.Scanner;

public class Ex2_25 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Informe um numero: ");
            int n = input.nextInt();

            if (n % 2 == 0)
                System.out.printf("%d e par.", n);
            if (n % 2 != 0)
                System.out.printf("%d e impar.", n);

            input.close();
        }
}