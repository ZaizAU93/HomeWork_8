package HomeWork_2_1;

public class Patient{

    int treatmentPlan;
    int doktorCode;

    public Patient(int plan){
        this.treatmentPlan = plan;
    }

    public Patient(){};

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }


//    @Override
//    public void appointment() {
//
//     //   System.out.println("�������� �������� �� ������� � "+ doctor.getJobTitle()+ " �� ����� " + doctor.getName());
//    }


}
