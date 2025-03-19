import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Podaj ciag znakow: ");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();

    System.out.println(input.toLowerCase());

    scanner.close();
  }
}