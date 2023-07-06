package hospital;

public class Janitor extends Administration {

    private boolean sweeping;

    public Janitor(String employeeNumber,String name,String departmnet,boolean sweeping) {
        super(employeeNumber,name,departmnet);
        this.sweeping=sweeping;
    }
    
    @Override
    public int calculatePay() {
        return 40000;
    }
}
