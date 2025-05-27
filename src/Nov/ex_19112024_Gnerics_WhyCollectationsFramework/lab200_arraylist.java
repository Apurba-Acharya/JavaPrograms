package Nov.ex_19112024_Gnerics_WhyCollectationsFramework;

import java.util.ArrayList;
import java.util.List;

public class lab200_arraylist {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("3");

        System.out.println("Fetched value -> " + list.get(3));
        System.out.println(list.size());
        System.out.println("Output boolean (isEmpty): " + list.isEmpty());
        System.out.println("Output boolean (contains): " + list.contains("1"));
        System.out.println("Output boolean (contains): " + list.contains(1));
        System.out.println(list.indexOf("3"));
        System.out.println(list.lastIndexOf("3"));

    }
}
