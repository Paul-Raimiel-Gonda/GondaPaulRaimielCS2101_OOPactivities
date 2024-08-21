import java.util.Scanner;

public class Tempconvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a Celsius value: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = celsius * (9.0 / 5.0) + 32;
        System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", celsius, fahrenheit);
        scanner.close();
    }
}