package hospital;

public abstract class Administration extends Employee {
    
    // Receptionist atDesk = new Receptionist("1", "name", false);
    // Janitor onFloor = new Janitor("1","name",true);

    private String department;

    public String getDepartment() {
        return department;
    }

    public Administration(String employeeNumber,String name, String department) {
        super(employeeNumber,name);
        this.department = department;
    }

    public abstract int calculatePay();
}
