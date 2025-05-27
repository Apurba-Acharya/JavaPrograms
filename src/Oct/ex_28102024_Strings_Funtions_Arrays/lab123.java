package Oct.ex_28102024_Strings_Funtions_Arrays;

public class lab123 {
    public static void main(String[] args) {
        String GHI = "Niagara. O roar again!";
        String CF = GHI.substring(11, 15); // 11 to 14 (actual)
        System.out.println(CF);

        String s1 = "apurba";
        String s2 = "acharya";
        String s3 = s1 + " " + s2;
        System.out.println(s3);

        //Spliting String:
        String F = "apple,banana,cherry";
        String [] split = F.split(",");
        System.out.println(split [0]);
        System.out.println(split [1]);
        System.out.println(split [2]);

       // ChatAt() -
        String s4 = "apurba";
        System.out.println(s4.charAt(5));

        //Trim >> Space remove
        String s5 = " Pramod ";
        System.out.println("Trim ->>" + s5.trim());

       //IndexOf
        String s6 = "Pramod";
        System.out.println("IndexOf -> " + s6.indexOf("a"));
        System.out.println("IndexOf -> " + s6.indexOf("d"));

        //contains
        String s7 = "Pramod";
        System.out.println("contains -> " + s7.contains("am"));
        System.out.println("contains -> " + s7.contains("od"));

        //LastIndexOf
        String s8 = "Pramoddutta";
        System.out.println(s8.lastIndexOf("d"));

        //replace & replaceAll: ***Interview ques ??
        String s9 = "PramoDDutta";
        String s11 = "PramoDDDDutta";
        System.out.println(s9.replace("D","Z"));
        System.out.println(s11.replaceAll("D","Z"));

        String Original2 = "Hello123 World456!";
        String result2 = Original2.replaceAll("\\d+" , "***"); // \\d+ >> any string
        System.out.println(result2);

        //Startswith & Endswith
        String s10 = "Pramoddutta";
        System.out.println("Startswith -> " + s10.startsWith("Pra"));
        System.out.println("Endswith -> " + s10.endsWith("ut"));

        //StringBuilder and (StringBuffer >> Thread safe)



   }
}
