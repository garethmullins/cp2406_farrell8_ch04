// This class discounts prices by 10%
public class DebugFour4
{
    public static void main(String args[])
    {
        final double DISCOUNT_RATE = 0.90;
        int price = 100;
        double price2 = 100.00;
        tenPercentOff(price, DISCOUNT_RATE);
        tenPercentOff(price2, DISCOUNT_RATE);
    }
    private static void tenPercentOff(int p, final double DISCOUNT_RATE)
    {
        double newPrice = p * DISCOUNT_RATE;
        System.out.println("Ten percent off " + p + ".00");
        System.out.printf("  New price is %.2f", newPrice);
        System.out.println("");
    }
    private static void tenPercentOff(double p, final double DISCOUNT_RATE)
    {
        double newPrice = p * DISCOUNT_RATE;
        System.out.printf("Ten percent off %.2f", p);
        System.out.printf("\n  New price is %.2f", newPrice);
        System.out.println("");
    }
}
