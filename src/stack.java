import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack <Integer> s1=new Stack<>();
        s1.push(16);
        s1.push(34);
        s1.push(67);
        s1.push(38);
        System.out.println(s1);
        s1.pop();
        System.out.println(s1);
        s1.peek();
        System.out.println(s1.peek());


    }
}
//last in last out