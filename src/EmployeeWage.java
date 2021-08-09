import java.util.Random;

public class EmployeeWage {
    public static int present=1;
    public static void main(String[] args) {
        Random ran=new Random();
        int is_present=ran.nextInt(2);
        if (present==is_present)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is absent");
    }
}
