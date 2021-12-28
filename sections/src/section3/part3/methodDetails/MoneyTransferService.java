package section3.part3.methodDetails;

import section3.part2.arrays.CurrencyConverter;

public class MoneyTransferService {
    //Assignment#3
    CurrencyConverter cc = new CurrencyConverter();

    double computeTransferAmount(int countryIndex, double amount) {
        double transferAmount = cc.computeTransferAmount(countryIndex, amount);
        return transferAmount;
    }

    double computeTransferFee(int countryIndex, double amount) {
        double transferFee = cc.computeTransferAmount(countryIndex, amount) * 0.02;
        return transferFee;
    }

    public static void main(String[] args) {
        MoneyTransferService transferService = new MoneyTransferService();
        double transferAmount = transferService.computeTransferAmount(0, 1000);
        double transferFee = transferService.computeTransferFee(0, 1000);

        System.out.println("Transfer Amount: " + transferAmount);
        System.out.println("Transfer Fee: " + transferFee);
    }
}
