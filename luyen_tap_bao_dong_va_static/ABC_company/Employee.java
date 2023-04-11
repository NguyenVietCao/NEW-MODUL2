package luyen_tap_bao_dong_va_static.ABC_company;

public class Employee {
    private String employeeName;
    private String employeeNumberPhone;
    private String workingParts;
    public static String companyName = "ABC";//TÊN DÙNG CHUNG CHO TẤT CẢ NHÂN VIÊN

    public Employee() {
    }

    public Employee(String employeeName, String employeeNumberPhone, String workingParts) {
        this.employeeName = employeeName;
        this.employeeNumberPhone = employeeNumberPhone;
        this.workingParts = workingParts;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeNumberPhone() {
        return employeeNumberPhone;
    }

    public void setEmployeeNumberPhone(String employeeNumberPhone) {
        this.employeeNumberPhone = employeeNumberPhone;
    }

    public String getWorkingParts() {
        return workingParts;
    }

    public void setWorkingParts(String workingParts) {
        this.workingParts = workingParts;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        Employee.companyName = companyName;
    }

    static Employee employee = new Employee("cao", "0905451778", "Student");

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeNumberPhone='" + employeeNumberPhone + '\'' +
                ", workingParts='" + workingParts + '\'' +
                ", companyName : " + companyName + '\'' +
                '}';
    }

    public static void displayEmployee() {
        System.out.print(employee);
    }


}
