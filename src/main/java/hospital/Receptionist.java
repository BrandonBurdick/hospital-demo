package hospital;

public class Receptionist extends Administration {
    
    private boolean onPhone;

    public Receptionist(String employeeNumber,String name,String department,boolean onPhone) {
        super(employeeNumber,name,department);
        this.onPhone=onPhone;
    }

    @Override
    public int calculatePay() {
        return 45000;
    }
}
