package Nov.ex_11112024_Encapsulation_Part2_Important.encap.CriminalPoliceExample.police;

public class Cop { //Class

    //Attributes >
    private int gun;   //Private can not allow within and outside package. Only can access within same class.
    public String icard = "125685";

    public Cop (int gun){ //Parameterized constructor
        this.gun = gun;
    }

    //Protected, can allow funtions within the package not outside the package
    //protected rarely used in automation
    protected void canIshoot(){ //Behaviours
        System.out.println("Yes you can!!");
    }
}

