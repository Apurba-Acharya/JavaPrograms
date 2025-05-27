package Nov.ex_05112024_OPPS;

public class lab139_OOPs_ObjectClass_StudentsATB_RunnerClass {   //***This is call runner class
    public static void main(String[] args) {
       lab139_OOPs_ObjectClass_StudentsATB s1 = new lab139_OOPs_ObjectClass_StudentsATB(); //***lab139_OOPs_ObjectClass_StudentsATB is getting called in the runner class
        //* s1 = object reference
        //* new lab139_OOPs_ObjectClass_StudentsATB(); = Object
        //* lab139_OOPs_ObjectClass_StudentsATB  = Class

       s1.name = "Pramod";
       //*** s1 = object reference used with attribute (name)
        s1.eat(10);
        //*** s1 = object reference used with behaviour (eat)
        s1.age = 10;
        System.out.println(s1.age);

       lab139_OOPs_ObjectClass_StudentsATB s2 = new lab139_OOPs_ObjectClass_StudentsATB();
       s2.name = "Amit";
       s2.address = "Kolkata";
       System.out.println(s2.address);
       s2.age = 20;
       int a = s2.walk2("50 KM");
       System.out.println("a = " + a);
    }
}
