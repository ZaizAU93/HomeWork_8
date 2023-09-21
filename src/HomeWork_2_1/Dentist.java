package HomeWork_2_1;

public class Dentist extends Doctor{
    public String jobTitle = "Den";
    public final int PpanKod = 2;


    public Dentist(String name) {
        this.name = name;
    }



    @Override
    public void treat() {
        System.out.println("Дантист лечит зубы");
    }
}
