package hospital;




public class Patient {

    private int healthLevel;
    private int bloodLevel;
    // private int patientId = 0;

    public int getHealthLevel() {
        return healthLevel;
    }

    public int getPatientId() {
        return patientId;
    }


    //Default constructor for a Patient object
    public Patient() {
        healthLevel=10;//default patients health level
        bloodLevel=20;//default patients blood level
        // patientId++;
    }

    //overloaded constructor
    public Patient(int healthLevel, int bloodLevel) {
        this.healthLevel=healthLevel;
        this.bloodLevel=bloodLevel;
        // patientId++;
    }


    public void increaseHealthLevel(int healthIncreaseAmount) {
        healthLevel += healthIncreaseAmount;
    }


    public int getBloodLevel() {
        return bloodLevel;
    }


    public void decreaseBloodLevel(int bloodDecreaseAmount) {
        bloodLevel -= bloodDecreaseAmount;
    }
    

}