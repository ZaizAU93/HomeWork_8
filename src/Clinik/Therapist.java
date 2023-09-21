package Clinik;

public class Therapist extends Doctor{
    @Override
    public void treat() {
        System.out.println("Лечение пациента терапевтом...");
    }

    public void SetTreatMethod(Patient patient) {
        String doctorSpeciality;
        switch (patient.getTreatmentPlan()) {
            case 1: doctorSpeciality ="Хирург";
            break;
            case 2: doctorSpeciality = "Дантист";
            break;
            default: doctorSpeciality ="Терапевт";
        };
        patient.setDoctorSpeciality(doctorSpeciality);
    }
}
