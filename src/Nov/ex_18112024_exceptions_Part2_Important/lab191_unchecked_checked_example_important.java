package Nov.ex_18112024_exceptions_Part2_Important;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class lab191_unchecked_checked_example_important {
    public static void main(String[] args) {
        //Unchecked Example:
        try {
            int a = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("unchecked");
        }

        //Checked Example: ***Imp.
        try {
            FileReader f = new FileReader(new File ("C://abc"));
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally checked excep...");
        }
    }
}
