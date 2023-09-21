package Clinik;

public class Dentist extends Doctor{
    @Override
    public void treat() {
        System.out.println("Лечение зубов пациента...");
    }
}
