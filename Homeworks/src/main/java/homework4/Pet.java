package homework4;

import java.util.Arrays;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    /*
     *   - The Pet class must display the following message:
     * `dog{nickname='Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}`, where `dog` = species;

     * */
    public Pet() {

    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        if (trickLevel > 0 && trickLevel <= 100) {
            this.trickLevel = trickLevel;
        } else {
            System.out.println("tricklevel is not valid, please enter  1 to 100");
        }
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.println("Hello, owner. I am - " + nickname + ". I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                ", species='" + species + '\'' +
                '}';
    }
    /*
*   - (`eat`) (method displays a message 'I am eating')
  - (`respond`) (method displays a message 'Hello, owner. I am - [the name of the pet]. I miss you!')
  - (`foul`) (method displays a message 'I need to cover it up')
* */


}
