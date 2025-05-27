package Oct.ex_23102024_Functions;

public class lab113_user_defined_funtions {
    public static void main(String[] args) {
        //user defined funtions
        //1. Without Arguments/Parameters and Without Return Type.
        greet();
        greet();

        //String returned = greet_with();
        //System.out.println(returned);

        int vote = age_of_vote();
        System.out.println(vote);
        if (vote == 18){
            System.out.println("allowed");
        }else{
            System.out.println("not allowed");

            your_name("amit");
        }
    }

    static void greet (){
        System.out.println("hiii...");
    }

    //2. Without Parameters but With Return Type
    //static String greet_with(){
        //System.out.println("Hii..good");
        //return "you are awasome";

    static int age_of_vote (){
            System.out.println("HII I can");
            return 18;
    }
     //3. With Parameters and Without Return Type
    static void your_name (String name ) {
        System.out.println(name);
    }

}