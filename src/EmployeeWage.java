import java.util.Random;

public class EmployeeWage {
    public static int present=1;
    public static int half_time=2;
    public static void main(String[] args) {
        int hr=0;
        Random ran=new Random();
        int is_present=ran.nextInt(3);

        switch (is_present){
            case 1:
                hr=8;
                break;
            case 2:
                hr=4;
                break;
            case 0:
                hr=0;
                break;
        }

        int wage_earned=hr*20;
        System.out.println("Wage earned by employee is Rs. " + wage_earned );
    }
}
