package hospital;

import org.junit.jupiter.api.Test;

public class Surgeon extends Doctor {

    private boolean operating;

    public Surgeon(String employeeNumber,String name,String speciality,boolean operating) {
        super(employeeNumber,name,speciality);
        this.operating = operating;
    }

    public void isOperating() {
        operating=true;
    }

    public void isNotOperating() {
        operating=false;
    }

    @Test
    public void operate(Patient sickPatient) {
        sickPatient.increaseHealthLevel(60);
    }

    @Override
    public int calculatePay() {
        return 120000;
    }
}
