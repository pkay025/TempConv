import java.util.Scanner;
import java.util.InputMismatchException;

public class TempConv {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number_of_your_choice = 5;
        double temperature = 12.4;

        System.out.println("Temperature Converter");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");

        boolean runProgram = true;

        while (true) {
            System.out.print("Please choose an option (1 or 2): ");
            try {
                number_of_your_choice = scanner.nextInt();
                if (number_of_your_choice == 1 || number_of_your_choice == 2) {
                    break;

                } else {
                    System.out.println("Invalid choice. Please enter 1 or 2.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number (1 or 2).");
                scanner.next();
            }

            while (true) {
                System.out.print("Enter the temperature value: ");
                try {
                    temperature = scanner.nextDouble();
                    break;

                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number for temperature.");
                    scanner.next();

                }

                double celsius = (temperature - 32) * 5 / 9;
                System.out.printf("%.2f Fahrenheit is %.2f Celsius.%n", temperature, celsius);

                scanner.close();
            }
        }
    }
}