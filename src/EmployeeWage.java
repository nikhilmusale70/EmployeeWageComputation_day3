import java.util.Random;

public class EmployeeWage {
    public static int present=1;
    public static void main(String[] args) {
        int hr=0;
        Random ran=new Random();
        int is_present=ran.nextInt(2);
        if (present==is_present)
            hr=8;

        int wage_earned=hr*20;
        System.out.println("Wage earned by employee is Rs. " + wage_earned );
    }
}
