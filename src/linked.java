
import java.util.LinkedList;
import java.util.List;
public class linked {
    public static void main(String[] args) {
        {
            List<Integer> l=new LinkedList<>();
            l.add(19);
            System.out.println(l);
            l.add(27);
            System.out.println(l);
            l.add(67);
            System.out.println(l);
            l.add(98);
            l.add(2,87);
            System.out.println(l);
//            l.addfirst(78);
//            System.out.println(l);
//            l.addlast(87);
//            System.out.println(l);
            l.remove(3);
            System.out.println(l);
            l.get(0);
            System.out.println(l);
            l.set(2,20);
            System.out.println(l);
            System.out.println(l.contains(20));
            System.out.println(l);
            l.clear();
            System.out.println(l);






//            l.clear();
//            System.out.println(l);
//
//            l.contains(60);
//            System.out.println(l);
//            l.set(0,20);
//            l.set();
//            l.reversed();
//            System.out.println(l);
//
        }

    }
}
