package fabricio.paiva.exercicios.cap2;
import java.util.Scanner;
import java.util.Locale;

public class Ex2_35 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o total de quilimotres dirigidos por dia: ");
        int kmDia = input.nextInt();
        System.out.print("Informe a quilometragem media por litro: ");
        double mediaKmLitro = input.nextDouble();
        System.out.print("Informe o preco do litro de combustivel: ");
        double precoLitroCombustivel = input.nextDouble();
        System.out.print("Informe o valor paga com estacionamento por dia: ");
        double precoEstacionamento = input.nextDouble();
        System.out.print("Informe o valor pago com pedagio por dia: ");
        double precoPedagio = input.nextDouble();

        double gastoComCombustivel = (kmDia / mediaKmLitro) * precoLitroCombustivel;
        double gastoTotal = gastoComCombustivel + precoEstacionamento + precoPedagio;

        System.out.printf("O valor total diario economizado com a faixa solidaria e: R$ %.2f", gastoTotal);

        input.close();
    }
}
