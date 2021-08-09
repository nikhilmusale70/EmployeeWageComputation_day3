import java.util.Random;

public class EmployeeWage {
    public static int present=1;
    public static int half_time=2;
    public static void main(String[] args) {
        int hr=0;
        Random ran=new Random();
        int is_present=ran.nextInt(3);
        if (present==is_present)
            hr=8;
        else if (half_time==is_present)
            hr=4;

        int wage_earned=hr*20;
        System.out.println("Wage earned by employee is Rs. " + wage_earned );
    }
}
