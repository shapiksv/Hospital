package Patient;

public class Hospital {
    public static void main(String[] args) {
//    Создать массив объектов. Вывести:
        Patient[] patients = new Patient[10];
        for (int i = 0; i < 10 ; i++) {
            Patient patient = new Patient(i, "Sergey" + i,"Shapowal" + i, "Mitinskay" + i,6579345 +i,95853305 + i, "Обоже");
        }

//    a) список пациентов, имеющих данный диагноз;
        String nidDiagnosis = "Обоже";
        for(Patient patient : patients){
            if(patient.getDiagnosis().equals(nidDiagnosis)){
                System.out.println(patient.toString());
            }
        }
//    b) список пациентов, номер медицинской карты которых находится в заданном интервале.
        int minMedicalCardNumber = 95853308;
        int maxMedicalCardNumber = 95853314;
        for(Patient patient : patients){
            if(patient.getMedicalCardNumber() >= maxMedicalCardNumber && patient.getMedicalCardNumber() <= maxMedicalCardNumber){
                System.out.println(patient.toString());
            }
        }

    }

}
