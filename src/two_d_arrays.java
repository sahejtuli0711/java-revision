public class two_d_arrays {
    public static void main(String[] args) {

        String[][] cars =
                {
                         {"Camaro","Corvette","Silverado"},
                         {"Mustang","Ranger","F-150"},
                         {"Ferrari", "Lamborghini", "Tesla"}
                };


        for(int i=0; i< cars.length; i++){
            System.out.println();
            for(int j=0; j< cars[i].length; j++){
                System.out.print(cars[i][j] +" ");
            }
        }
    }
}
