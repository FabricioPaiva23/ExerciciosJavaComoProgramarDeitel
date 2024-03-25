package fabricio.paiva.exercicios.cap2;
import java.util.Scanner;

public class Ex2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result, num1, num2, num3;

        System.out.print("Informe o primeiro numero: ");
        num1 = input.nextInt();

        System.out.print("Informe o segundo numero: ");
        num2 = input.nextInt();

        System.out.print("Informe o segundo numero: ");
        num3 = input.nextInt();

        result = num1 * num2 * num3;

        System.out.printf("The product of numbers is %d%n", result);

        input.close();
    }
}
