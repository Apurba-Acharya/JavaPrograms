package Nov.ex_19112024_Gnerics_WhyCollectationsFramework;

import java.util.ArrayList;
import java.util.Collection; //Which package collection framework is available ? > interview Ques.
import java.util.List;

public class lab199_arraylist {
    public static void main(String[] args) {
        //    Collection list = new ArrayList();
            List list2 = new ArrayList();
        //ArrayList list2 = new ArrayList();
        list2.add("dutta");
        list2.add("anil");
        list2.add("amit");
        list2.add("dutta");
        list2.add(true);
        list2.add(125);
        list2.add(null);

        System.out.println("Print entaire arraylist value: " + list2);
        Object o = list2.get(5); // In collection framework Object can fetch all types of data (eg: string, integer)
        System.out.println("Printing specific value by storing the value in Object: " + o);
        System.out.println("Printing specific value without storing the value in Object: " + list2.get(6));
    }
}
