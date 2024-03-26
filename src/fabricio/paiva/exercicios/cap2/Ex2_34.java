package fabricio.paiva.exercicios.cap2;
public class Ex2_34 {
    public static void main(String[] args) {
        long POP_MUNDIAl = 8019876189L;
        double TAXA_CRESCIMENTO_POP = 0.008;

        System.out.printf("Depois de 1 ano a populacoa mundial sera de: %f%n", POP_MUNDIAl * Math.pow( 1 + TAXA_CRESCIMENTO_POP, 1) );
        System.out.printf("Depois de 2 ano a populacoa mundial sera de: %f%n", POP_MUNDIAl * Math.pow( 1 + TAXA_CRESCIMENTO_POP, 2) );
        System.out.printf("Depois de 3 ano a populacoa mundial sera de: %f%n", POP_MUNDIAl * Math.pow( 1 + TAXA_CRESCIMENTO_POP, 3) );
        System.out.printf("Depois de 4 ano a populacoa mundial sera de: %f%n", POP_MUNDIAl * Math.pow( 1 + TAXA_CRESCIMENTO_POP, 4) );
        System.out.printf("Depois de 5 ano a populacoa mundial sera de: %f%n", POP_MUNDIAl * Math.pow( 1 + TAXA_CRESCIMENTO_POP, 5) );
    }
}
