package hospital;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JanitorTest {
    Janitor underTest = new Janitor("1","name","Janitorial",true);

    @Test
    public void shouldExpectASalaryof40k() {
        int salary = underTest.calculatePay();
        assertEquals(40000, salary);
    }
}
