package homework4;

import java.util.Arrays;

public class Human {
    private String name;
    private String surname;
    private int birthDate;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;

    public Human() {

    }

    public Human(String name, String surname, int birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public Human(String name, String surname, int birthDate, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int birthDate, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        if (iq >= 1 && iq <= 100) {
            this.iq = iq;
        } else {
            System.out.println("iq must be between 1 and 100");
        }

    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public void greetPet() {
        System.out.println("Hello, " + pet);
    }

    public void describePet() {

        System.out.printf("I have %s , he is %d years old, he is %s\n",
                pet.getSpecies(), pet.getAge(), pet.getAge() > 50 ? "very sly" : "almost not sly");
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", iq=" + iq +
                ", pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }
}
