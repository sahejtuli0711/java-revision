import java.util.Scanner;

public class nestedloops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.println("Enter number of columns: ");
        int columns = scanner.nextInt();

        System.out.println("Enter symbol to use: ");
        String symbol = scanner.next();

         for(int i=1; i<=rows; i++) {
             System.out.println();

             for (int j = 1; j <= columns; j++) {
                 System.out.print(symbol);
             }

         }
    }
}
