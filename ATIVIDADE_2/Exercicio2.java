import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de Temperatura");
        System.out.println("Escolha a conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        int choice = scanner.nextInt();

        double temperature, convertedTemperature;

        if (choice == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            temperature = scanner.nextDouble();
            convertedTemperature = celsiusToFahrenheit(temperature);
            System.out.println("Temperatura em Fahrenheit: " + convertedTemperature);
        } else if (choice == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            temperature = scanner.nextDouble();
            convertedTemperature = fahrenheitToCelsius(temperature);
            System.out.println("Temperatura em Celsius: " + convertedTemperature);
        } else {
            System.out.println("Escolha inválida. Encerrando o programa.");
        }

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
