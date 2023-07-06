package hospital;

import java.util.Collection;
import java.util.HashMap;
import java.util.ArrayList;
public class Hospital {

    HashMap<String, Employee> employeeList = new HashMap<>();
    HashMap<Integer, Patient> patientList = new HashMap<>();

    int patientId;

    public void hire(Employee employeeToHire) {
        employeeList.put(employeeToHire.getEmployeeNumber(), employeeToHire);
    }

    public Employee findEmployee(String employeeNumber) {
        return (Employee) employeeList.get(employeeNumber);
    }

    public Collection<Employee> getAllEmployees() {
        return employeeList.values();
    }

    public Collection<Employee> getMedicalEmployees() {
        Collection<Employee> medicalEmployees = new ArrayList<>();
        for(Employee employee: employeeList.values() ){
            if(employee instanceof MedicalDuties) {
                medicalEmployees.add(employee);
            }
        }
        return medicalEmployees;
    }

    public void admit(Patient patientToAdmit) {
        patientId++;
        patientList.put(patientId, patientToAdmit);
    }

    public Collection<Patient> getAllPatients() {
        return patientList.values();
    }



}
