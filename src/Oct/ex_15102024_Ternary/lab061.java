package Oct.ex_15102024_Ternary;

public class lab061 {
    public static void main(String[] args) {
        //nested ternary
        //result = condition1 ? expression1 : (condition2 ? expression2 : expression3);
        //Grade - score > 90 or above - A
        //Grade - score > 80 - 89 - B
        //Grade - score > 70 - 79 - C
        //Grade - score > 60 - 69 - D
        //Below 60 will be F
        int score = 50;
        String grade = (score >=90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "Fail";
        System.out.println(grade);
        System.out.println("your grade is - " + grade);
        System.out.printf("your grade is %s", grade);
    }
}
