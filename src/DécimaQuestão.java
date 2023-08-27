public class DécimaQuestão {
    public static void main(String[] args) {
        Double saldo = 500.50;
        Double deposito = saldo += 300.25;
        Double saque = deposito -= 150.75;

        System.out.printf("%.2f", saque);

    }
}