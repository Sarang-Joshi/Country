/**
 * Created by Sarang on 12/01/2015.
 */
public class CurrencyFactory
{
    public static Currency creatCurrency(String countryName)
    {
        Currency currency = null;
        if (countryName.equalsIgnoreCase("India")) {
            currency = new Rupees();
        } else if (countryName.equalsIgnoreCase("UK")) {
            currency = new Pound();
        } else if (countryName.equalsIgnoreCase("US")) {
            currency = new Dollar();
        }
        return currency;
    }
}
