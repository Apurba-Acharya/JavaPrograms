package Oct.ex_14102024_OperatorsP2;

public class lab059 {
    public static void main(String[] args) {
      int course = 100;
      float GST = 15.45f;
      int T = course+(int)GST; // Narrowing -> explicit
        System.out.println(T);
    }
}
