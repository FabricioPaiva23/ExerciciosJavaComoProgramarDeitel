package fabricio.paiva.exercicios.cap2;
import java.util.Scanner;

public class Ex2_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o raio do circulo: ");

        float raio = input.nextInt();
        System.out.printf("Diamentro: %f%n", 2 * raio);
        System.out.printf("Circunferencia: %f%n", raio * Math.PI * 2);
        System.out.printf("Area: %f%n", Math.PI * Math.pow(raio, 2));

        input.close();
    }
}
