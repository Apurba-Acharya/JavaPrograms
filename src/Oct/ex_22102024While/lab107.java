package Oct.ex_22102024While;

public class lab107 {
    public static void main(String[] args) {

        //User input by:
        // 1. Arguments
        // 2. Scanner Class
        // 3. Buffer Reader

        //Take a User input for the age and print the output
        String age_string = args[0];
        //String >> Int
        int age = Integer.parseInt(age_string);
        //System.out.println(age);

        while (age>0){
            System.out.println(age);
            age--;
        }
    }
}
