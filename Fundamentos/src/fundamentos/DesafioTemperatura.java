package fundamentos;

public class DesafioTemperatura {
    public static void main(String[] args) {
        // (F - 32) X 5/9 = C
        final double AJUSTE = 32;
        final double FATOR = (5.0 /9.0);

        double f = 86;
        double celsius = (f - AJUSTE) * FATOR;

        System.out.println("O resultado é " + celsius);
    }
}
