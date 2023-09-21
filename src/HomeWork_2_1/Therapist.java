package HomeWork_2_1;
import java.util.Scanner;

public class Therapist extends Doctor{
        Patient patient;
        public String jobTitle = "Ter";
        public final int PpanKod = 3;

        @Override
        public void treat() {
            System.out.println("“ерапевт - направл€ет на анализы");
        }

        Scanner line = new Scanner(System.in);


         public void appointment(Patient patient) {
             int treatmentPlan = patient.getTreatmentPlan();
             switch (treatmentPlan) {
                 case 1:
                     System.out.println("Ћечение будет проводить хирург");
                     patient.treatmentPlan = line.nextInt();
                     break;
                 case 2:
                     System.out.println("Ћечение будет проводить дантист");
                     patient.treatmentPlan = line.nextInt();
                     break;
                 default:
                     System.out.println("Ћечение будет проводить терапевт, пока не примет решение передать другому врачу");
                     patient.treatmentPlan = line.nextInt();
                     break;
             }
         }


}

