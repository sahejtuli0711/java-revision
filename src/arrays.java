public class arrays {
    public static void main(String[] args) {

        /*

        String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"};
        cars[0] = "Mustang";

         */

        String[] cars = new String[4];

        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";
        cars[3] = "BMW";

        for(int i=0; i<4; i++){
            System.out.println(cars[i]);
        }
    }
}
