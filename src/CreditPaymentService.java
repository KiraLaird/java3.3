public class CreditPaymentService {

    private double credit;

    public int calculate(int amount, double monthRate, int tenor) {
        monthRate = monthRate / 12 / 100;
        double ratio = (monthRate * Math.pow((1 + monthRate), tenor)) / (Math.pow((1 + monthRate), tenor) - 1);
        int credit = (int) (amount * ratio);

        System.out.println(" Сумма кредита:" + (amount) + " руб.");
        System.out.println(" Процентная ставка:" + (monthRate) + " %.");
        System.out.println(" Количество месяцев:" + (tenor));
        System.out.println(" Ежемесячный платеж:" + (credit) + " руб.");

        return (int) credit;
    }
}
