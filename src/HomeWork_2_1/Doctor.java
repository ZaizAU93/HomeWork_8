package HomeWork_2_1;

abstract public class Doctor {
    String name;
    String jobTitle;
    abstract public void treat();

    public String getJobTitle() {
        return jobTitle;
    }

    public String getName() {
        return name;
    }
}
