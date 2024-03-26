package fabricio.paiva.exercicios.cap2;
import java.util.Scanner;

public class Ex2_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o primeiro numero: ");
        int n1 = input.nextInt();
        System.out.print("Informe o segundo numero: ");
        int n2 = input.nextInt();
        System.out.print("Informe o terceiro numero: ");
        int n3 = input.nextInt();
        System.out.print("Informe o quarto numero: ");
        int n4 = input.nextInt();
        System.out.print("Informe o quinto numero: ");
        int n5 = input.nextInt();

        int positivos = 0;
        int negativos = 0;
        int zeros = 0;

        if (n1 > 0)
            positivos += 1;
        if (n1 == 0)
            zeros += 1;
        if (n1 < 0)
            negativos += 1;

        if (n2 > 0)
            positivos += 1;
        if (n2 == 0)
            zeros += 1;
        if (n2 < 0)
            negativos += 1;

        if (n3 > 0)
            positivos += 1;
        if (n3 == 0)
            zeros += 1;
        if (n3 < 0)
            negativos += 1;

        if (n4 > 0)
            positivos += 1;
        if (n4 == 0)
            zeros += 1;
        if (n4 < 0)
            negativos += 1;

        if (n5 > 0)
            positivos += 1;
        if (n5 == 0)
            zeros += 1;
        if (n5 < 0)
            negativos += 1;

        System.out.printf("Quantidade de positivos: %d%n", positivos);
        System.out.printf("Quantidade de negativos: %d%n", negativos);
        System.out.printf("Quantidade de zeros: %d%n", zeros);

        input.close();
    }
}
