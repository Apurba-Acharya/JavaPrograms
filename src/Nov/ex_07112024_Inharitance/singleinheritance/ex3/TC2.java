package Nov.ex_07112024_Inharitance.singleinheritance.ex3;

public class TC2 extends common_BaseTest{
    public TC2() {
        System.out.println("DC-child2");
    }
    //TC1(){
    //System.out.println("DC-child");
    void testcase2(){
        System.out.println("EXECUTING");
        sBrowser();
        cBrowser();
        rBrowser();
    }
}
