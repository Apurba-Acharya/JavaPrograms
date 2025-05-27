package Task;

public class Q37_ReverseAnIntegerNumber {

    // Reverse an integer Number

    public static void main(String[] args) {

        // Using algorithm:
        int num = 1234;
        int rev = 0;
        while (num!=0){
            rev = rev*10 + num%10; // 0*10 + 1234%10 = 4  || 4*10 + 123%10 = 40+3 = 43 || 43*10 + 12%10 = 432 || 432*10 + 1%10 = 4321
            num = num/10; // 1234/10 = 123 || 123/10 = 12 || 12/10 = 1 || 1/10 = 0
        }
        System.out.println("Reverse number is (algorithm): " + rev);

        // Using StringBuffer class:
        int n = 56789;
        String str = String.valueOf(n);
        StringBuffer sbf = new StringBuffer(str);
        System.out.println("Reverse number is (StringBuffer): " + sbf.reverse());

        // Using StringBuilder class:
        int u = 45678;
        StringBuilder sbl = new StringBuilder();
        sbl.append(u);
        System.out.println("Reverse number is (StringBuilder): " + sbl.reverse());
    }
}
