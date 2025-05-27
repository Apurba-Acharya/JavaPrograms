package Nov.ex_21112024_ListSetCollectionFramework;

import java.util.Stack;

public class lab210_Stack {
    public static void main(String[] args) {
        //last in first out (LIFO)
        Stack s = new Stack();
        s.add("dutta1");
        s.add("dutta2");
        s.add("dutta3");
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.empty());
        System.out.println(s.add("dutta8"));

        System.out.println(s);
        s.push("child");
        System.out.println(s);

        s.add(0, "luckey");
        System.out.println(s);

        System.out.println(s.get(0));
        System.out.println(s.get(1));


    }
}
