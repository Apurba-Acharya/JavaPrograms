package Nov.ex_19112024_Gnerics_WhyCollectationsFramework;

public class lab196_Generics3 {
    public static void main(String[] args) {
        test <String> i = new test <> ("jvnvn");
        test <Integer> i2 = new test<>(589);
        System.out.println(i.getObj() + i2.getObj());
    }
}
class test <T>{
    T obj;

    public test(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
