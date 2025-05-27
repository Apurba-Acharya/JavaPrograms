package Oct.ex_21102024_Forloop;

public class lab100 {
    public static void main(String[] args) {

        //different outputs based on whether the number is even or odd >>>

            for (int i = 0; i<=50; i++){
                if (i%2 == 0){
                    System.out.println("even >> " + i);
                    continue;
                }
                else {
                    System.out.println(i);
                }
            }
    }
}
