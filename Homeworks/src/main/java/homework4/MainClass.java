package homework4;

public class MainClass {
    public static void main(String[] args) {
//        `dog{nickname='Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}`, where `dog` = species;
        Pet dog = new Pet("dog", "Rock", 5, 75, new String[]{"eat", "drink", "sleep"});

        System.out.println(dog);


        Human mother = new Human("Jane", "Karleone");
        Human father = new Human("Vito", "Karleone");
        Human child = new Human("Michael", "Karleone", 1977, 90, dog, mother, father, new String[][]{});


        System.out.println(child);

    }

}
