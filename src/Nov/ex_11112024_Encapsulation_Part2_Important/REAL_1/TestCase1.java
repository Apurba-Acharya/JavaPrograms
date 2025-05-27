package Nov.ex_11112024_Encapsulation_Part2_Important.REAL_1;

public class TestCase1 extends BaseClass { //Child class; Inharitance

    public TestCase1 (){ //Child Default constructor
        super(); //Super is used to call Parent default constructor
        System.out.println("child DC-TC1");
    }

    public void startTestcase (){ //Child behaviours method extends parents behaviours
        openBrowser();
        closeBrowser();
        openBrowser("firefox");
    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {
        System.out.println("Own logic: " + browser);
        super.setBrowser(browser, isAuth);
    }
}