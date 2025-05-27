package Nov.ex_18112024_exceptions_Part2_Important;

public class lab194_Custoom_Exceptation {
    public static void main(String[] args) throws Exception {
        Bank sbi = new Bank("INR",100);
        Bank icici = new Bank("INR" , 123);
        System.out.println(sbi.add(icici));

        Bank jp_Morgan = new Bank("USD",200);
        System.out.println(sbi.add(jp_Morgan));
    }
}
