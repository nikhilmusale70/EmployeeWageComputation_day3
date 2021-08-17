import java.util.Random;

public class EmployeeWage {

    public static void main(String[] args) {
        EmployeeWageLogic emp = new EmployeeWageLogic("dell", 25, 23, 190 ); // for comapny1
        EmployeeWageLogic emp1 = new EmployeeWageLogic("BridgeLabz",20, 20, 200); // for company2
        System.out.println(emp);
        System.out.println(emp1);
    }
}
