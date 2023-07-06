package hospital;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NurseTest {
    
    Nurse underTest = new Nurse("1","name",5);
    Patient sickPatient = new Patient();

    @Test
    public void provideCare() {
        underTest.careForPatient(sickPatient);
        int patientHealthLevel = sickPatient.getHealthLevel();
        assertEquals(15,patientHealthLevel);
    }

    @Test
    public void decreaseBloodLevelFrom20to15WhenDrawingBlood() {
        underTest.drawBlood(sickPatient);
        int bloodLevel=sickPatient.getBloodLevel();
        assertEquals(15,bloodLevel);
    }
    @Test
    public void shouldExpectASalaryof50k() {
        int salary = underTest.calculatePay();
        assertEquals(50000, salary);
    }
}
