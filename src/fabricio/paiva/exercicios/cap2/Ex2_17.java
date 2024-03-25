package fabricio.paiva.exercicios.cap2;
import java.util.Scanner;

public class Ex2_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3, soma, media, produto, menor, maior;
        menor = 0;
        maior = 0;

        System.out.print("Informe o primeiro numero: ");
        n1 = input.nextInt();

        System.out.print("Informe o segundo numero: ");
        n2 = input.nextInt();

        System.out.print("Informe o terceiro numero: ");
        n3 = input.nextInt();

        soma = n1 + n2 + n3;
        media = soma / 3;
        produto = n1 * n2 * n3;

        if (n1 > n2 && n1 > n3){
            maior = n1;
        }
        if (n2 > n1 && n2 > n3){
            maior = n2;
        }
        if (n3 > n1 && n3 > n2){
            maior = n3;
        }
        if (n1 < n2 && n1 < n3){
            menor = n1;
        }
        if (n2 < n1 && n2 < n3){
            menor = n2;
        }
        if (n3 < n1 && n3 < n2){
            menor = n3;
        }

        System.out.printf("Produto: %d%n", produto);
        System.out.printf("Soma: %d%n", soma);
        System.out.printf("Media: %d%n", media);
        System.out.printf("Maior: %d%n", maior);
        System.out.printf("Menor: %d%n", menor);

        input.close();
    }
}
