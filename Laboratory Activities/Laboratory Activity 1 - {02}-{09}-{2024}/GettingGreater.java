import java.util.Scanner;

public class GettingGreater {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("\nGetting the Greater Value");
    System.out.print("\nEnter the first character: ");
    char char1 = scanner.next().charAt(0);
    System.out.print("Enter the second character: ");
    char char2 = scanner.next().charAt(0);

    char greater = (char) Math.max(char1, char2);

    System.out.println("-------------------------------------------------");
    System.out.println("The character with the greater value is: " + greater);
    System.out.println("-------------------------------------------------");

    System.out.println("Showing the ASCII Codes");
    System.out.println(char1 + " : " + (int) char1);
    System.out.print(char1 + " : " + (int) char2);
    }
}
