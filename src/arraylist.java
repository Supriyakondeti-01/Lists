import java.util.ArrayList;
import java.util.List;
public class arraylist {
    public static void main(String[] args) {
        ArrayList <String> A1=new ArrayList<>();
        A1.add("ramesh");
        A1.add("Karan");
        A1.add("Danush");
        System.out.println(A1);
        A1.add("Rajesh");
        A1.add("Suresh");
        System.out.println(A1);

        A1.add(5,"Dhara");
        System.out.println(A1);

        A1.remove(5);
        System.out.println(A1);


    }
}
