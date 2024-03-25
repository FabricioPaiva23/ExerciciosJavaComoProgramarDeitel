package fabricio.paiva.exercicios.cap2;
import java.util.Scanner;

public class Ex2_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um numero de cinco digitos: ");
        int n = input.nextInt();

        int unidade = n / 10000;
        int dezena = n / 1000 % 10;
        int centena = n / 100 % 10;
        int milhar = n / 10 % 10;
        int centenaDeMilhar = n % 10;

        System.out.printf("%d %d %d %d %d", unidade, dezena, centena, milhar, centenaDeMilhar);

        input.close();
    }
}
