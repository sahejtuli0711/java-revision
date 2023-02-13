public class variable_swap {
    public static void main(String[] args) {

        String x = "water";
        String y = "Kool-Ade";
        String temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: "+x);
        System.out.println("y: "+y);


    }
}
