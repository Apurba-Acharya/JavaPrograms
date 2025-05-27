package Nov.ex_08112024_2_Polymorphism.over_loading;

public class lab148 { //Runner class
    public static void main(String[] args) {
        mpr m = new mpr(); //Object
        int sum = m.add(5,10);
        float s = m.add(50.258f,2.255f);
        System.out.println(sum);

       m.add(5,5,7);
    }
}

class mpr { //Class

    //Method Overloading: Same name but different arguments or parameter
    //Method will be OverLoaded

    //behaviours >>>
    int add (int a, int b){ //Return type with argument
        return a+b;
    }
    float add (float a, float b) { //Return type with argument
        return a + b;
    }
    void add (int a, int b, int c){ //No return type with argument
        System.out.println("Hello");
    }
}
