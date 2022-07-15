public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = (int) service.calculate(1000000, 9.99, 12);

        System.out.println(" Ежемесячный платеж:" + (credit) + " руб.");

        System.out.println("");

        credit = (int) service.calculate(1000000, 9.99, 24);

        System.out.println(" Ежемесячный платеж:" + (credit) + " руб.");

        System.out.println("");

        credit = (int) service.calculate(1000000, 9.99, 36);

        System.out.println(" Ежемесячный платеж:" + (credit) + " руб.");

    }
}

