package Oct.ex_16102024_conditions_loops;

public class lab069_Arguments {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[2]);
        System.out.println(args[1]);
        System.out.printf("%s, %s, %s" , args[0] , args[2] , args[1]);
        int age = Integer.parseInt(args[2]);
        System.out.println(age>25 ? "allow":"not allowed");

    }
}
