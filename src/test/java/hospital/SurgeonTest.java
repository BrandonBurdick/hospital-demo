package hospital;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SurgeonTest {
    Surgeon inOperation = new Surgeon("1","name","specialty",true);
    Patient sickPatient = new Patient();

    @Test
    public void provideSurgery() {
        inOperation.operate(sickPatient);
        int patientHealthLevel = sickPatient.getHealthLevel();
        assertEquals(70,patientHealthLevel);
    }

    @Test
    public void shouldExpectASalaryof120000(){
        int salary = inOperation.calculatePay();
        assertEquals(120000,salary);
    }
}
