package homework6;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;
    private int countOfChildren = 0;

    public Family() {
        this.mother = new Human();
        this.father = new Human();
        this.pet = new Pet();
    }

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
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

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public boolean deleteChild(int index) {
        if (index >= 0 && index < this.children.length) {
            Human temp = this.children[index];
            for (int i = index + 1; i < this.countOfChildren; i++) {
                this.children[i - 1] = this.children[i];
            }

            this.countOfChildren--;
            System.out.println(temp + " deleted");
            return true;
        } else {
            return false;
        }

    }

    public boolean deleteChild(Human child) {
        int index = 0;
        boolean flag = false;
        for (int i = 0; i < this.countOfChildren; i++) {
            if (child.equals(this.children[i])) {
                index = i;
                Human temp = this.children[index];
                for (int j = index + 1; j <= countOfChildren; j++) {
                    this.children[j - 1] = this.children[j];
                }
                System.out.println(temp + " deleted");

                this.countOfChildren--;
                flag = true;
                break;
            }
        }
        return flag;
    }

    public void addChild(Human child) {
        this.children[this.countOfChildren] = child;
        this.countOfChildren++;
    }

    public int countFamily() {
        return this.countOfChildren + 2;
    }

    @Override
    protected void finalize() throws Throwable {

        System.out.println("Family object destroyed");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return countOfChildren == family.countOfChildren &&
                Objects.equals(mother, family.mother) &&
                Objects.equals(father, family.father) &&
                Arrays.equals(children, family.children) &&
                Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet, countOfChildren);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }
}
