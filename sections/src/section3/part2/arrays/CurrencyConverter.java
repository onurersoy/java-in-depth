package section3.part2.arrays;

public class CurrencyConverter {
    //Assignment#2

    double[] exchangeRates = new double[] {63.0, 3.0, 3.0, 595.0, 18.0, 107.0, 2.0};

    void printCurrencies() {

        System.out.println("rupee: " + exchangeRates[0]);
        System.out.println("dirham: " + exchangeRates[1]);
        System.out.println("real: " + exchangeRates[2]);
        System.out.println("chilean_peso: " + exchangeRates[3]);
        System.out.println("mexican_peso: " + exchangeRates[4]);
        System.out.println("_yen: " + exchangeRates[5]);
        System.out.println("$australian: " + exchangeRates[6]);
        System.out.println("# of currency types: " + exchangeRates.length);

    }

    public static void main(String[] args) {

        CurrencyConverter cc = new CurrencyConverter();
        cc.printCurrencies();
    }

}
