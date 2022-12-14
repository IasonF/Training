package onewelcome;

import org.javamoney.moneta.spi.LazyBoundCurrencyConversion;

import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.convert.CurrencyConversion;
import javax.money.convert.MonetaryConversions;

public class CurrencyConverter {
    public static void main(String[] args) {
        MonetaryAmount oneDollar = Monetary.getDefaultAmountFactory().setCurrency("USD")
                .setNumber(1).create();

        CurrencyConversion conversionEUR = MonetaryConversions.getConversion("EUR");

        MonetaryAmount convertedAmountUSDtoEUR = oneDollar.with(conversionEUR);

        System.out.println(oneDollar.toString());
        System.out.println(convertedAmountUSDtoEUR);

    }
}
