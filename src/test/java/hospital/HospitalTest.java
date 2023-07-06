package hospital;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.contains;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

import java.util.ArrayList;
import java.util.Collection;

public class HospitalTest {
    Hospital underTest = new Hospital();
    Doctor doctor = new Doctor("1","name","Bones");
    Nurse nurse = new Nurse("2","Lady",5);
    Janitor Janitor = new Janitor("3","Guy","Janitorial",true);

    @Test
    public void shouldBeAbleToHireADoctor() {
        underTest.hire(doctor);
        Employee foundDoctor = underTest.findEmployee("1");
        assertEquals("name", foundDoctor.getName());

    }

    @Test
    public void shouldBeAbleToHire() {
        underTest.hire(doctor);
        underTest.hire(nurse);
        underTest.hire(Janitor);
        Employee foundDoctor = underTest.findEmployee("1");
        Employee foundNurse = underTest.findEmployee("2");
        Employee foundJanitor = underTest.findEmployee("3");
        assertEquals("name", foundDoctor.getName());
        assertEquals("Lady", foundNurse.getName());
        assertEquals("Guy", foundJanitor.getName());

    }

    @Test
    public void shouldBeAbleToHireCollection() {
        underTest.hire(doctor);
        underTest.hire(nurse);
        underTest.hire(Janitor);
        Collection<Employee> hiredEmployees = underTest.getAllEmployees();
        assertThat(hiredEmployees, containsInAnyOrder(doctor,nurse,Janitor));
    }

    @Test
    public void displayMedicalPersonnel() {
        underTest.hire(doctor);
        underTest.hire(nurse);
        underTest.hire(Janitor);
        Collection<Employee> medicalEmployees = underTest.getMedicalEmployees();
        assertThat(medicalEmployees, containsInAnyOrder(doctor,nurse));
    }

    @Test
    public void admitTwoPatients() {
        Patient sickPatient = new Patient();
        Patient sickerPatient = new Patient(5,10);
        underTest.admit(sickPatient);
        underTest.admit(sickerPatient);
        Collection<Patient> admittedPatients = underTest.getAllPatients();
        assertThat(admittedPatients, containsInAnyOrder(sickPatient,sickerPatient));
    }
}
