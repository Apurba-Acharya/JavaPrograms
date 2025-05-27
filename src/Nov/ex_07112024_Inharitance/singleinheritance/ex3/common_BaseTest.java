package Nov.ex_07112024_Inharitance.singleinheritance.ex3;

public class common_BaseTest {
    public common_BaseTest() {     // DC
        System.out.println("DC-parents");
    }

    //Behaviours of common_BaseTest
    void sBrowser(){
        System.out.println("Start Browser");
    }
    void cBrowser(){
        System.out.println("closing Browser");
    }
    void rBrowser(){
        System.out.println("Reading Browser");
    }
}
