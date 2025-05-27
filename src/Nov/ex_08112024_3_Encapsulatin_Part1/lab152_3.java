package Nov.ex_08112024_3_Encapsulatin_Part1;
import java.util.Scanner;
public class lab152_3 {
    public static void main(String[] args) {
        man obj2 = new man();
//        man obj1 = new man();
//        obj1.setAge(50);
//        obj1.setName("noob1");
//        System.out.println(obj1.getAge() + " - >> " + obj1.getName());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int ab = sc.nextInt();
        obj2.setAge(ab);
        System.out.println("Enter name");
        String cd = sc.next();
        obj2.setName(cd);
        System.out.println(obj2.getAge() + " - >" + obj2.getName());
    }
}

class man{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

