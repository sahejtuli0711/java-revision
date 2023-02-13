import java.sql.SQLOutput;
import java.util.Scanner;
public class mathclass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x;
        double y;
        double z;

        System.out.println("Please enter side x (in CM): ");
        x = scanner.nextDouble();
        System.out.println("Please enter side y (in CM): ");
        y = scanner.nextDouble();

        z = ((x*x) + (y*y));


        z = Math.sqrt(z);

        System.out.println("The hypotenuse of the triange is: "+ z);

        scanner.close();
    }
}
