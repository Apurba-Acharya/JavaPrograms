package Nov.ex_21112024_ListSetCollectionFramework;

import java.util.Stack;

public class Practice_1 {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.add("dutta1");
        s.add("dutta2");
        s.add("dutta9");
        System.out.println(s);
        System.out.println(s.get(0));
        System.out.println(s.add(324));

        s.add(0, "dutta10");
        System.out.println(s);
    }
}
