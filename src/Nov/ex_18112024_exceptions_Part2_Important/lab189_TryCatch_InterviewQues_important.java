package Nov.ex_18112024_exceptions_Part2_Important;

public class lab189_TryCatch_InterviewQues_important {

    //Which exception will be print in below code

    public static void main(String[] args) {
        try {
            String s1 = "Pramod";
            String a1 = args[0]; //1. array index bound exceptions
            int a = 10/0; //2. arithmetic exceptions
            s1 = null; //3. null pointer exceptions
            System.out.println(s1.trim());
        }catch (Exception e){
            System.out.println("There is some problem...");
            System.out.println(e.getMessage());
        }
        System.out.println("Enf of Program!!!");
    }

}
