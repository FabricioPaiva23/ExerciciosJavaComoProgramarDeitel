package fabricio.paiva.exercicios.cap2;
import java.util.Scanner;

public class Ex2_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3, n4, n5;
        int maior = 0;
        int menor = 0;

        System.out.print("Informe o primeiro numero: ");
        n1 = input.nextInt();
        System.out.print("informe o segundo numero:");
        n2 = input.nextInt();
        System.out.print("Informe o terceiro numero: ");
        n3 = input.nextInt();
        System.out.print("Informe o quarto numero: ");
        n4 = input.nextInt();
        System.out.print("Informe o quinto numero: ");
        n5 = input.nextInt();

        if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5)
            maior = n1;
        if (n2 > n1 && n2 > n3 && n2 > n4 && n2 > n5)
            maior = n2;
        if (n3 > n1 && n3 > n2 && n3 > n4 && n3 > n5)
            maior = n3;
        if (n4 > n1 && n4 > n2 && n4 > n3 && n4 > n5)
            maior = n4;
        if (n5 > n1 && n5 > n2 && n5 > n3 && n5 > n4)
            maior = n5;

        if (n1 < n2 && n1 < n3 && n1 < n4 && n1 < n5)
            menor = n1;
        if (n2 < n1 && n2 < n3 && n2 < n4 && n2 < n5)
            menor = n2;
        if (n3 < n1 && n3 < n2 && n3 < n4 && n3 < n5)
            menor = n3;
        if (n4 < n1 && n4 < n2 && n4 < n3 && n4 < n5)
            menor = n4;
        if (n5 < n1 && n5 < n2 && n5 < n3 && n5 < n3 && n5 < n4)
            menor = n5;
        System.out.printf("Maior = %d%n", maior);
        System.out.printf("Menor = %d%n", menor);

        input.close();
    }
}
