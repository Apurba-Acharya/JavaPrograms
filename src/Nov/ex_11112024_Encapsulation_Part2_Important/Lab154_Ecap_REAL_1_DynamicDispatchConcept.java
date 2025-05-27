package Nov.ex_11112024_Encapsulation_Part2_Important;

import Nov.ex_11112024_Encapsulation_Part2_Important.REAL_1.TestCase1;

public class Lab154_Ecap_REAL_1_DynamicDispatchConcept {
    public static void main(String[] args) {
        //BaseClass tc1 = new TestCase1(); //(Dynamic Dispatch: Father (BaseClass) reference and child (TestCase1) object)
        TestCase1 tc1 = new TestCase1(); //Object
        tc1.setBrowser("Chrome", true);
        tc1.startTestcase();
    }
}
