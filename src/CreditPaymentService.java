public class CreditPaymentService {

    private double credit;

    public int calculate(int a, double b, int c) {
        int amount = a; //  сумма кредита
        double monthRate = b / 12 / 100; //  процентная ставка в месяц, равная годовой ставке, поделённой на 12
        double yearRate = b;
        int tenor = c; //  количество платежей
        double ratio = (monthRate * Math.pow((1 + monthRate), tenor)) / (Math.pow((1 + monthRate), tenor) - 1);
        int credit = (int) (amount * ratio);

        System.out.println(" Сумма кредита:" + (amount) + " руб.");
        System.out.println(" Процентная ставка:" + (yearRate) + " %.");
        System.out.println(" Количество месяцев:" + (tenor));
        System.out.println(" Ежемесячный платеж:" + (credit) + " руб.");

        return (int) credit;
    }
}
