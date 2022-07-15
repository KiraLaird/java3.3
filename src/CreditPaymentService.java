public class CreditPaymentService {

    private double credit;

    public int calculate(int a, double b, int c) {
        int amount = a; //  сумма кредита
        double percent = b / 12 / 100; //  процентная ставка в месяц, равная годовой ставке, поделённой на 12
        double year = b;
        int payments = c; //  количество платежей
        double ratio = (percent * Math.pow((1 + percent), payments)) / (Math.pow((1 + percent), payments) - 1);

        System.out.println(" Сумма кредита:" + (amount) + " руб.");
        System.out.println(" Процентная ставка:" + (year) + " %.");
        System.out.println(" Количество месяцев:" + (payments));
        credit = (amount * ratio);

        return (int) credit;
    }
}
