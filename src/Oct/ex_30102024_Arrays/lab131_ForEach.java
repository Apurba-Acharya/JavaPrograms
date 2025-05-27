package Oct.ex_30102024_Arrays;

public class lab131_ForEach {
    public static void main(String[] args) {
        //Enhanced loops
        int [] a = new int [3];
        a[0] = 20;
        a[1] = 10;
        a[2] = 90;

        for(int i:a){
            System.out.println(i);
        }
        String [] S = {"god1","god2","god3"};
        for (String name:S){
            System.out.println(name);
        }
        String [] S1 = new String[3];
        S1[0] = "G1";
        S1[1] = "G2";
        S1[2] = "G3";

        for (String i:S1){
            System.out.print(i);
        }
    }
}
