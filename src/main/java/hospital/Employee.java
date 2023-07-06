package hospital;

public abstract class Employee {

    private String employeeNumber;
    private String name;

    public Employee(String employeeNumber, String name) {
        this.employeeNumber=employeeNumber;
        this.name=name;
    }

    public Object getName() {
        return name;
    }

    public String getEmployeeNumber(){
        return employeeNumber;
    }

    public abstract int calculatePay();
}
