package Nov.ex_14112024_Static_Wrapper_Exceptions;

public class lab163Static {
    public static void main(String[] args) {

//        students s1 = new students(); // non static veriable can only access by creating object.
//        s1.age;
        students s1 = new students(200);
        students s2 = new students(200);

        System.out.println(students.school_name); //static variable Can access without creating any object.
        students.school_name = "MNO";
        System.out.println(students.school_name);
        System.out.println(s1.school_name);

//        int a = s1.age;
//        System.out.println(students.age); >>non static in nature
    }
}

class students {
    int age; //not static variable/Instance variable
    static String school_name = "ABC";//static variable

    public students(int age) { //Parameterized constructor
        this.age = age;
        System.out.println("Parameterized constructor: " + this.age);
    }

    {
        System.out.println("IIB>> Intance Initialization block");
        System.out.println("Read a MySQL db()");
    }
    static {
        System.out.println("SIB>> Static Initialization block >> Loaded once, when Class is loaded");
    }
}
