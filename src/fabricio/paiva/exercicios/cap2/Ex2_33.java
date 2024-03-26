package fabricio.paiva.exercicios.cap2;
import java.util.Scanner;
import java.util.Locale;

public class Ex2_33 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner input = new Scanner(System.in);

        System.out.print("Informe sua altura em metros: ");
        double altura = input.nextDouble();
        System.out.print("Informe seu peso em quilogramas: ");
        double peso = input.nextDouble();

        double imc = peso / (Math.pow(altura, 2));

        System.out.printf("Seu IMC e: %.1f%n", imc);
        System.out.println("BMI VALUES");
        System.out.println("Underweight: less tha 18.5\nNormal: between 18.5 and 24.9\nOverweight: between 25 and 29.9");
        System.out.print("Obese: 30 or greater");

        input.close();
    }
}
