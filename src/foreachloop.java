import java.util.ArrayList;

public class foreachloop {
    public static void main(String[] args) {

        // String[] animals = {"cat","dog","rat","budgie"};
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("budgie");

        //for each string,  index i in array of animals
        for(String i : animals) {
            System.out.println(i);
        }
    }
}
