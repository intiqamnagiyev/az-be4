package homework5;

public class MainClass {
    public static void main(String[] args) {
        Human mother = new Human("Aynur", "Musayeva");
        Human father = new Human("Kenan", "Musayev");
        Human child1 = new Human("Ayaz", "Musayev");
        Human child2 = new Human("Aysel", "Musayeva");
        Human[] children = new Human[5];

        Pet dog = new Pet("dog", "Dreyk", 4, 60, new String[]{"eat"});
        Family family = new Family(mother, father, children, dog);
        family.addChild(child1);
        System.out.println(family);
        family.addChild(child2);
        System.out.println(family);
        family.deleteChild(0);//for testing
        System.out.println(family);
        family.deleteChild(0);//for testing
        System.out.println(family);
        family.addChild(child1);
        System.out.println(family);


    }

}
