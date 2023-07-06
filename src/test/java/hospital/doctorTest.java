package hospital;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class doctorTest {

    Doctor underTest = new Doctor("1","name","specialty");
    Patient sickPatient = new Patient();

    @Test
    public void provideCare() {
        underTest.careForPatient(sickPatient);
        int patientHealthLevel = sickPatient.getHealthLevel();
        assertEquals(20,patientHealthLevel);
    }

    @Test
    public void decreaseBloodLevelFrom20to15WhenDrawingBlood() {
        underTest.drawBlood(sickPatient);
        int bloodLevel=sickPatient.getBloodLevel();
        assertEquals(15,bloodLevel);
    }

    @Test
    public void shouldExpectASalaryof90k() {
        int salary = underTest.calculatePay();
        assertEquals(90000, salary);
    }
}
