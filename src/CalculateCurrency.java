import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sarang on 12/01/2015.
 */
public class CalculateCurrency {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String countryName = bufferedReader.readLine();
        Currency currency = CurrencyFactory.creatCurrency(countryName);
        printCurrency.printCurrency(currency);
    }
}
