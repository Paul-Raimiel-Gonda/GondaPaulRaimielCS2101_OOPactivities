import java.util.Scanner;

public class GettingInputs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the Year: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the Genre: ");
        String genre = scanner.nextLine();
        System.out.print("Enter the Album: ");
        String album = scanner.nextLine();
        System.out.print("Enter the Song Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter the Artist: ");
        String artist = scanner.nextLine();

        System.out.print("-------------------------------");
        System.out.print("\nSONG DETAILS");
        System.out.print("\n-------------------------------");

        System.out.println("\nYear Released: " + year);
        System.out.println("Genre: " + genre);
        System.out.println("Album: " + album);
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        scanner.close();
    }
}
