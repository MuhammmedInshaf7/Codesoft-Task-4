package CurrencyConverter;
import java.util.Scanner;
import java.util.HashMap;


import java.util.Scanner;
import java.util.HashMap;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Simulated exchange rates (for simplicity)
        HashMap<String, Double> exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0);  // Base currency is USD
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("JPY", 110.0);
        exchangeRates.put("GBP", 0.75);
        exchangeRates.put("AUD", 1.35);  // Australian Dollar
        exchangeRates.put("CAD", 1.25);  // Canadian Dollar
        exchangeRates.put("CHF", 0.92);  // Swiss Franc
        exchangeRates.put("CNY", 6.45);  // Chinese Yuan
        exchangeRates.put("INR", 74.5);  // Indian Rupee
        exchangeRates.put("MXN", 20.0);  // Mexican Peso
        exchangeRates.put("ZAR", 14.5);  // South African Rand

        System.out.println("Available currencies: USD, EUR, JPY, GBP, AUD, CAD, CHF, CNY, INR, MXN, ZAR");

        // Currency selection
        System.out.print("Enter the base currency: ");
        String baseCurrency = scanner.next().toUpperCase();

        if (!exchangeRates.containsKey(baseCurrency)) {
            System.out.println("Invalid base currency.");
            return;
        }

        System.out.print("Enter the target currency: ");
        String targetCurrency = scanner.next().toUpperCase();

        if (!exchangeRates.containsKey(targetCurrency)) {
            System.out.println("Invalid target currency.");
            return;
        }

        // Amount input
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        // Currency conversion
        double baseRate = exchangeRates.get(baseCurrency);
        double targetRate = exchangeRates.get(targetCurrency);
        double convertedAmount = (amount / baseRate) * targetRate;

        // Display result
        System.out.printf("Converted amount: %.2f %s\n", convertedAmount, targetCurrency);
    }
}
