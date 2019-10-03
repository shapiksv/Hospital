package Patient;

public class Patient {
//    3. Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской карты, Диагноз.
    private int id;
    private String lastName;
    private String firstName;
    private String adress;
    private int phoneNumber;
    private int MedicalCardNumber;
    private String Diagnosis;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getMedicalCardNumber() {
        return MedicalCardNumber;
    }

    public void setMedicalCardNumber(int medicalCardNumber) {
        MedicalCardNumber = medicalCardNumber;
    }

    public String getDiagnosis() {
        return Diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        Diagnosis = diagnosis;
    }

    public Patient(int id, String lastName, String firstName, String adress, int phoneNumber, int medicalCardNumber, String diagnosis) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        MedicalCardNumber = medicalCardNumber;
        Diagnosis = diagnosis;


    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", adress='" + adress + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", MedicalCardNumber=" + MedicalCardNumber +
                ", Diagnosis='" + Diagnosis + '\'' +
                '}';
    }
}
