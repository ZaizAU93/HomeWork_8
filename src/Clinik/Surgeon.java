package Clinik;

public class Surgeon extends Doctor{
    @Override
    public void treat() {
        System.out.println("Операция пациента...");
    }

}
