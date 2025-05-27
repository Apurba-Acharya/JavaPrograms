package Nov.ex_11112024_Encapsulation_Part2_Important.encap.CriminalPoliceExample.criminal;

import Nov.ex_11112024_Encapsulation_Part2_Important.encap.CriminalPoliceExample.police.Cop;

public class thief {
    public static void main(String[] args) {
        Cop c = new Cop(10);
        //System.out.println(c.gun);
        //c.canIshoot();
        String d = c.icard;
        System.out.println(d);
    }
}