package homework4;

public class MainClass {
    public static void main(String[] args) {
//        `dog{nickname='Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}`, where `dog` = species;
        Pet dog = new Pet("dog", "Rock", 5, 75, new String[]{"eat", "drink", "sleep"});

        System.out.println(dog);
        //- In the Main class create several families, so that every class uses all the available constructors. Display data about every person.
        Human child1 = new Human("Sanan", "Musayev", 1997);
        System.out.println("child1");
        child1.print(child1);
        child1.describePet();
        child1.greetPet();
        System.out.println("=========");

        Human child2 = new Human("Sanana", "Musayev", 1997,
                new Human("Narmin", "Musayeva"), new Human("Kanan", "Musayev"));
        System.out.println("child2");
        child2.print(child2);
        child2.describePet();
        child2.greetPet();
        System.out.println("========");

        Human child3 = new Human("Sanana", "Musayev", 1997,
                new Human("Narmin", "Musayeva"),
                new Human("Kanan", "Musayev"), 90,
                new Pet("dog", "Dreyk", 4, 67,
                        new String[]{"eat", "drink", "sleep"}), new String[][]{});
        System.out.println("child3");
        child3.print(child3);
        child3.describePet();
        child3.greetPet();
        System.out.println("========");

        Human mother = new Human("Jane", "Karleone");
        Human father = new Human("Vito", "Karleone");
        Human child = new Human("Michael", "Karleone", 1977, mother, father, 90, dog, new String[][]{});

        System.out.println("child");
        child.print(child);
        child.describePet();
        child.greetPet();


    }

}
