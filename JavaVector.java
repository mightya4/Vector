import java.util.Vector;

public class JavaVector {
    public static void main(String[] args) {
        //Instantiate Vector
        Vector<Integer> v = new Vector<Integer>();

        //Populate Vector
        for(int i = 0; i <= 10; i++) {
            v.add(i);
        }

        //Display Vector Elements
        v.forEach((i) -> {
            System.out.println(i);
        });

        //Remove Vector Element
        v.remove(5);

        System.out.println("-----------After Element Removal-------------");
        //Display All Vector Elements
        v.forEach((i) -> {
            System.out.println(i);
        });
    }
}
