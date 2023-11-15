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

//        amountTax = amountIncome * taxRateMax / 100;

//        System.out.println("the tax amount is:" + amountTax);

    }
}
