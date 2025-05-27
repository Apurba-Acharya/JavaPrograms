package Nov.ex_06112024_Constructors;

public class lab142_Constructor_Car {
    public static void main(String[] args) {
        Car_DefaultConstructor tesla = new Car_DefaultConstructor(); // >> Object 1
        System.out.println("Object 1 default constructor value: " + tesla.name + tesla.year + " " + tesla.model);

        Car_DefaultConstructor nano = new Car_DefaultConstructor();  // >> Object 2
        nano.name = "maruti";
        nano.model = "D22";
        nano.year = 2000;
        System.out.println("Object 2 default constructor value: " + nano.model + nano.name + nano.year);
    }
}


