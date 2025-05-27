package Nov.ex_11112024_Encapsulation_Part2_Important.REAL_1;

public class BaseClass { //Parent Class
    //Attribute
   private String browser;

   //Default constructors:
   BaseClass(){
       System.out.println("DC -> BaseClass");
   }
   //Paramterised constructor:
    BaseClass (String b){
        System.out.println("PC -> BaseClass");
    }

    //Encapsulation (getter and setter):
    public String getBrowser() {
        return browser;
    }
    public void setBrowser(String browser , boolean isAuth) {
        if (isAuth){
            this.browser = browser;
        }else{
            System.out.println("Not access");
        }
    }

    //Behavious + Method Overloading (same name with different arguments)
    void openBrowser(){
        System.out.println("Opening Browser...");
    }
    void openBrowser (String browserName) {
        System.out.println("Open Browser ... ->> " + browserName);
    }
    void closeBrowser(){
        System.out.println("Closing Browser...");
    }
}