package Oct.ex_29102024_Arrays;
//interview inm. ques >>>
public class lab129_arrya_Max_value_interiew_Ques {
    public static void main(String[] args) {
        int [] array = {25, 14, 56, 36, 56, 77, 18, 29, 49};
        int max_value = give_max(array);
        System.out.println("Max is  -- >>" + max_value);
    }

    static int give_max(int[] array){
        int max = array [0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
