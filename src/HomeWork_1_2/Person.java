package HomeWork_1_2;

public class Person {
    //������ 2:
    //������� ����� Person � ������ name, age, gender. ���� name ������� public, age
    //�������� �� �������, gender � private. � ������ Main ������� ������ Person.
    //������������ ����� ���� �� ������. ������������������ �������� ����� �������
    //��������� ������� � ���� ���� ��� ��������


    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String name;
    int age;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
