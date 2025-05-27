package Nov.ex_14112024_Static_Wrapper_Exceptions;

public class lab170_enumP3 {
    public static void main(String[] args) {
        System.out.println(color.Red.getHexcode());

        if (color.Red.getHexcode() == "#458K") {
            System.out.println("colour is red");
        }
    }
}
enum color{
    Red ("#458K");
//    green ("#458K");
//    yellow ("#458K");

    private String hexcode;
    color (String hexcode){
        this.hexcode = hexcode;
    }

    String getHexcode() {
        return this.hexcode;
    }
}
