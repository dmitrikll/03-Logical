package HW03;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static double amountIncome;
    static double amountTax;
    static double incomeRateMin;
    static double incomeRateMax;
    static double taxRateMin;
    static double taxRateMiddle;
    static double taxRateMax;

    public static void main(String[] args) {

        incomeRateMin = 10000;
        incomeRateMax = 25000;
        taxRateMin = 2.5;
        taxRateMiddle = 4.3;
        taxRateMax = 6.7;

        Scanner scannerIncome = new Scanner(System.in);
        scannerIncome.useLocale(Locale.ENGLISH);

        System.out.print("Please, enter the amount of income: ");
        amountIncome = scannerIncome.nextDouble();
        scannerIncome.nextLine();

        if (amountIncome < incomeRateMin) {
            amountTax = amountIncome * taxRateMin / 100;
            System.out.printf("The tax amount is: %.2f \n", amountTax);
        } else if (amountIncome > incomeRateMin & amountIncome < incomeRateMax) {
            amountTax = amountIncome * taxRateMiddle / 100;
            System.out.printf("The tax amount is: %.2f \n", amountTax);
        } else {
            amountTax = amountIncome * taxRateMax / 100;
            System.out.printf("The tax amount is: %.2f \n", amountTax);
        }

        scannerIncome.close();

    }
}
