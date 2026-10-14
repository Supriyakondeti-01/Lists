import java.util.ArrayList;
import java.util.List;
public class list1 {
    public static void main(String[] args) {
        {
            List<Integer>l=new ArrayList<>();
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
            l.remove(1);
            System.out.println(l);
            l.remove(1);
            System.out.println(l);
            l.get(0);
            System.out.println(l);
            l.clear();
            System.out.println(l);

            l.contains(60);
            System.out.println(l);
            l.sort(87  <60> 27);
//            l.addLast(30);
//            l.addFirst(50);
//            l.set();
//            l.reversed();
//            System.out.println(l);
//
        }

    }
}
//addFirst and addLast, removeFirst and removeLast,reversed methods are not there in this folder