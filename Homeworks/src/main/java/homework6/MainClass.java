package homework6;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        Human mother = new Human("Aynur", "Musayeva");
        mother.setSchedule(new String[][]{{DayOfWeek.MONDAY.name()}, {"go to cinema"}});//it is for enums.name() method
        Human father = new Human("Kenan", "Musayev");
        Human child1 = new Human("Ayaz", "Musayev");
        Human child2 = new Human("Aysel", "Musayeva");
        Human[] children = new Human[5];
        Pet dog = new Pet(Species.DOG, "Dreyk", 4, 60, new String[]{"eat"});

        Family family = new Family(mother, father, children, dog);

        family.addChild(child1);
        System.out.println(family);
        family.addChild(child2);
        System.out.println(family);
        family.deleteChild(child1);//for testing
        System.out.println(family);


        // it is for finalize mehod
        for (int i = 0; i < 10; i++) {
            // Family family = new Family(mother, father, children, dog);
            System.gc();
        }


    }

}
