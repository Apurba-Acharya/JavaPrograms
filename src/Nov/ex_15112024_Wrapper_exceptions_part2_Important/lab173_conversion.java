package Nov.ex_15112024_Wrapper_exceptions_part2_Important;

public class lab173_conversion {
    public static void main(String[] args) {
        String num = "10";

        //String -> Wrapper (Integer) -> Premitive
        Integer a = Integer.valueOf(num);
        int a2 = a;
        System.out.println(a2);

        //direct process: String -> premitive
        int a3 = Integer.parseInt(num);
        System.out.println(a3);
    }

}
