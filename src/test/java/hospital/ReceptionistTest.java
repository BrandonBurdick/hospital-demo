package hospital;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReceptionistTest {
    Receptionist atDesk = new Receptionist("1","name","Receptionist",false);

    @Test
    public void shouldExpectASalaryOf45000() {
        int salary = atDesk.calculatePay();
        assertEquals(45000,salary);
    }
}
