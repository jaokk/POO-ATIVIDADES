import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite um putro número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite uma operação (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result = 0.0;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero não pode.");
                    return;
                }
                break;
            default:
                System.out.println("inválido.");
                return;
        }

        System.out.println("Resultado: " + result);

        scanner.close();
    }
}
