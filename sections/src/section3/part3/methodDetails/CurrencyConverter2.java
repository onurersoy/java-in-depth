package section3.part3.methodDetails;

public class CurrencyConverter2 {
    //Assignment#2.refactoring1.version2

    double[] exchangeRates;

    void setExchangeRates(double[] rates) {
        exchangeRates = rates;
    }

    void updateExchangeRates(int arrayIndex, double newVal) {
        exchangeRates[arrayIndex] = newVal;
    }

    double getExchangeRate(int arrayIndex) {
        return exchangeRates[arrayIndex];
    }

    double computeTransferAmount(int arrayIndex, double amount) {
        //return amount * exchangeRates[arrayIndex];
        //Let's refactor the code above^^:
        return amount * getExchangeRate(arrayIndex);
    }

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

        CurrencyConverter2 cc = new CurrencyConverter2();

        double[] rates = {63.0, 3.0, 3.0, 595.0, 18.0, 107.0, 2.0};
        //assignment statement^^
        cc.setExchangeRates(rates);

        cc.printCurrencies();

        /*
        Jan 1st rates:
        double[] rates = {63.0, 3.0, 3.0, 595.0, 18.0, 107.0, 2.0};
        In an assignment statement, you cannot initialize a statement the way above^^. You have use "new".
        */
        rates = new double[] {63.0, 3.0, 3.0, 595.0, 18.0, 107.0, 2.0};
        cc.setExchangeRates(rates);

        cc.printCurrencies();

        cc.updateExchangeRates(0, 66.0);
        cc.printCurrencies();

        double amount = cc.computeTransferAmount(0, 1000);
        System.out.println("\nTransferred amount: " + amount);
    }
}
