package Oct.ex_29102024_Arrays;

import java.util.Arrays;

public class lab125 {
    public static void main(String[] args) {
        //type 1:
        int [] marks1 = {10,17,18,13,14,15};

        //type2:
        int [] marks = new int [3];
        marks [0] = 90;
        marks [1] = 93;
        marks [2] = 92;

        boolean [] is_male_data = new boolean[2];
        is_male_data [0] = true;
        is_male_data [1] = false;

        System.out.println(marks1[2]);
        System.out.println(marks1[0]);
        System.out.println("length -> " + marks1.length);

        Arrays.sort(marks1);
        System.out.println(marks1 [0]);
        System.out.println(marks1 [1]);
        System.out.println(marks1 [3]);

        for (int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        Arrays.sort (marks);
        int item_index = Arrays.binarySearch (marks, 15);
        System.out.println(item_index);
    }
}
