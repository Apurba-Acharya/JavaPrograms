package Task;

public class Q49_ElementThatAppearsOnceInAnArrayOthersAppearsTwice {

    //Find The Element That Appears Once In An Array Where Every Other Element Appears Twice in Java

    public static void main(String[] args) {
        int arr [] = {5, 3, 4, 5, 2, 3, 4};

        int res = arr[0];
        for (int i=1; i<arr.length; i++){
            res = res^arr[i];
        }
        System.out.println("Single repetated element is : " + res);
    }
}
