package Clinik;

public abstract class Doctor {
    String name;
    String JobTittle;

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTittle() {
        return JobTittle;
    }

    public void setJobTittle(String jobTittle) {
        JobTittle = jobTittle;
    }

    public String getName() {
        return name;
    }

     public void treat() {
        System.out.println("Лечение пациента...");
    }
}
