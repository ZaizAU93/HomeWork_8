package Clinik;

public class Patient {
    private int treatmentPlan;
    private Doctor doctor;
    private String doctorSpeciality;

    public String getDoctorSpeciality() {
        return doctorSpeciality;
    }

    public void setDoctorSpeciality(String doctorSpeciality) {
        this.doctorSpeciality = doctorSpeciality;
    }

    public Patient(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void treat() {
        doctor.treat();
    }

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    public Doctor getDoctor() {
        return doctor;
    }
}
