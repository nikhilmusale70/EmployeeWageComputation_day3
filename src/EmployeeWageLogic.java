import java.util.Random;

public class EmployeeWageLogic {

    public static int present=1;
    public static int half_time=2;
    public static int totalDay;
    public int wage_earned;

    public int wagePerHour;
    public int companyDay;
    public int workingHoursPerMonth;
    public String companyName;

    public EmployeeWageLogic(String companyName,int wagePerHour, int companyDay, int workingHoursPerMonth){
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.companyDay = companyDay;
        this.workingHoursPerMonth = workingHoursPerMonth;
        employeeWageLogic();
    }

    public void employeeWageLogic(){
        int hr = 0;
        int total_hr=0;
        wage_earned = 0;
        Random ran = new Random();
        for (int day=1;day<=companyDay;day++){
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
            total_hr = hr + total_hr;

            if (day==companyDay || hr==workingHoursPerMonth) {
                break;
            }
        }
        wage_earned = total_hr * wagePerHour;
     //   System.out.println("For Company "+ companyName +" Wage earned by employee is Rs. " + wage_earned);
    }

    @Override
    public String toString() {
        return "For Company "+ companyName +" Wage earned by employee is Rs. " + wage_earned ;
    }
}
