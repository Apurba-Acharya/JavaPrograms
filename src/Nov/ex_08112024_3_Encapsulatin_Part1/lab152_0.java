package Nov.ex_08112024_3_Encapsulatin_Part1;

public class lab152_0 {
    public static void main(String[] args) {
        //Using public attribute >>> Anyone can access and change the username and password
        VMOLogin vmoLogin = new VMOLogin("admin", "password123"); //Object 1
        System.out.println(vmoLogin.password);
        vmoLogin.password = "hacker"; // Using public hacker can change password easily...
        System.out.println(vmoLogin.password);

        //Using private attribute
        GoodVMOLogin vmoLogin1 = new GoodVMOLogin("admin2", "password12"); //Object 2
        System.out.println("Username is: " + vmoLogin1.getUsername() + " ; Password is: " + vmoLogin1.getPassword());

        String pass = vmoLogin1.getPassword(true);
        //vmoLogin1.setPassword("hacker123");
        System.out.println(pass);
    }
}

class GoodVMOLogin{ //Class
    //Attributes >>
    private String username;
    private String password;

    public GoodVMOLogin(String username, String password) { //Parameterized constructor
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
//    public void setUsername(String username) {
//        this.username = username;
//    }

    public String getPassword() {
        return password;
    }
//    public void setPassword(String password) {
//        this.password = password;
//    }

    public String getPassword(boolean isAdmin) {
        if (isAdmin){
            return password;
        }
        return "none";
    }
}

class VMOLogin { //Class
    //Attributes
    public String username;
    public String password;

    public VMOLogin(String username, String password) { //Parameterized constructor
        this.username = username;
        this.password = password;
    }
}