import java.util.Random;

public class EmployeeWage {
    public static int present=1;
    public static int half_time=2;
    public static void main(String[] args) {
        int hr = 0;
        int total_hr=0;
        int wage_earned = 0;
        Random ran = new Random();
        for (int day=1;day<=20;day++){
            int is_present = ran.nextInt(3);
            switch (is_present) {
                case 1:
                    hr = 8;
                    break;
                case 2:
                    hr = 4;
                    break;
                case 0:
                    hr = 0;
                    break;
            }
            total_hr=hr + total_hr;

            if (day==20 || hr==100) {
                break;
            }
        }
        wage_earned = total_hr * 20;
        System.out.println("Wage earned by employee is Rs. " + wage_earned );
    }
}
