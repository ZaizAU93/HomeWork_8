import HomeWork_1_1.Build;
import HomeWork_1_1.Garage;
import HomeWork_1_1.House;
import HomeWork_1_2.Person;
import Clinik.*;
import java.util.Scanner;
import java.lang.reflect.Field;
public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Scanner line = new Scanner(System.in);

        //Задача 1:
        //Создать класс Build с одним полем type. Создать 2-х наследников этого класса – House и
        //Garage, в которых при создании в конструкторе будет присваиваться в поле type значения
        //“House” и “Garage” соответственно. В методе main другого класса создать объекты House
        //и Garage классов. Продемонстрировать значения полей этих классов используя геттеры
        Build house = new House("House");
        Build garage = new Garage("Garage");
        house.getType();
        garage.getType();
        house.setType("Меняем на эту строку");
        house.getType();

        //Задача 2:
        //Создать класс Person с полями name, age, gender. Поле name сделать public, age
        //оставить по дефолту, gender – private. В классе Main создать объект Person.
        //Предположить какие поля мы увидим. Продемонстрировать значения полей объекта
        //используя геттеры и поля если это возможно

        Person person = new Person("Jon", 21, "мужик");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getGender());
        System.out.println(person.name);

        //Задача 1:
        //Создать программу для имитации работы клиники. Пусть в клинике будет три врача:
        //хирург, терапевт и дантист. Каждый врач имеет метод «лечить», но каждый врач лечит
        //по-своему. Так же предусмотреть класс «Пациент» с полем «План лечения» и полем
        //«Доктор». Создать объект класса «Пациент» и добавить пациенту план лечения. У
        //терапевта создать метод, который будет назначать врача пациенту согласно плану
        //лечения:
        //Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
        //Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
        //Если план лечения имеет любой другой код – назначить терапевта и выполнить метод
        //лечить
/*
        Doctor den = new Dentist("Boris");
        Doctor surg = new Surgeon("Jon");

        Patient patient = new Patient(3);
        Therapist ther = new Therapist();
        ther.appointment(patient);

        while ( patient.getTreatmentPlan() != 0) {

            System.out.println("Отправляем пациента к :\t");
            System.out.println("1- хирургу:\t");
            System.out.println("2- дантисту:\t");
            System.out.println("0- умер в очереди:\t");
            System.out.println("1- лечение у терапевта:\t");
            ther.appointment(patient);
        }

 */
        System.out.println("код лечения. 1 - хирург. 2 - дантист, остальное терапевт");
        System.out.println("Введите значение:");
        Patient patient = new Patient(line.nextInt());
        Therapist therapist_1 = new Therapist();
        therapist_1.SetTreatMethod(patient);


        if (patient.getTreatmentPlan() == 1) {
            Doctor surgeon = new Surgeon();
            patient.setDoctor(surgeon);
            patient.treat();
        } else if (patient.getTreatmentPlan() == 2) {
            Doctor dentist = new Dentist();
            patient.setDoctor(dentist);
            patient.treat();
        } else {
            Doctor therapist = new Therapist();
            patient.setDoctor(therapist);
            patient.treat();
        }

        System.out.println("Лечение у пациента проводит - "+ patient.getDoctorSpeciality());
        //System.out.println(patient.getDoctor());

        //Создать класс Apple и добавить в него поле color с модификатором доступа private и
        //инициализировать его. В методе main другого класса создать объект Apple, и не
        //используя сеттеры изменить значение поля color


        System.out.println("Apple");
        Apple apple = new Apple();


        Field field = apple.getClass().getDeclaredField("color");

        field.setAccessible(true);
        System.out.println(field.get(apple));
        field.set(apple, "green");
        System.out.println(field.get(apple));
    }
}