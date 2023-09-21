package HomeWork_2_1;

public class Surgeon extends Doctor{
    public String jobTitle = "Sur";
    public final int PpanKod = 1;
    String name;

    public Surgeon(String name) {
        this.name = name;
    }

    @Override
    public void treat() {
        System.out.println("Хирург делает операции");
    }
}
