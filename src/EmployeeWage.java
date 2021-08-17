public class EmployeeWage {

    public static void main(String[] args) {
        EmployeeWageLogic[] ewl = new EmployeeWageLogic[2];
        ewl[0] = new EmployeeWageLogic("dell", 25, 23, 190 );     // for comapny1
        ewl[1] = new EmployeeWageLogic("BridgeLabz",20, 20, 200); // for company2
        System.out.println(ewl[0]);
        System.out.println(ewl[1]);
    }
}
