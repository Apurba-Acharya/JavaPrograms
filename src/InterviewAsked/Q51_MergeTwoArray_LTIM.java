package InterviewAsked;

public class Q51_MergeTwoArray_LTIM {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {10,20,30,40,50,60,5};

        int aL = a.length;
        int bL = b.length;
        int cL  = aL+bL;
        int[] c = new int [cL];
        for (int i=0; i<aL; i++){
            c[i] = a[i];
        }
        for (int i=0; i<bL; i++){
            c[aL+i] = b[i];
        }
        for(int i=0; i<cL; i++){
            System.out.print(c[i] + " ");
        }
    }
}
