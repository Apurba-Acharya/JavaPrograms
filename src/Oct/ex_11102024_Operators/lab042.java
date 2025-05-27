package Oct.ex_11102024_Operators;

public class lab042 {
    public static void main(String[] args) {
        int a = +65;
        int b = -5;
        b = b+1;
        System.out.println(a+b);

        String name1 = "4";
        String name2 = "pp";
        System.out.println(name1+name2);

        //real example:
        String name4 = "hh";
        String name5 = "pp";
        int p = +65;
        int u = -5;

        System.out.println(name4+name5+p+u); //1st operator is string >> concatinationr

        System.out.println(p*u+name4+name5);//1st integer >> concatination

        System.out.println(name4+name5+(p+u)); //BODMAS

    }
}
