//Superclass - Inheritance
public class Animal {
    //Encapsulation
    private String name;
    private String species;
    private int age;

    public Animal(String name, String species, int age) {
        //Constructor
        this.name = name;
        this.species = species;
        this.age = age;
    }

    //Getter
    public String getName() {
        return name;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    //Getter
    public String getSpecies() {
        return species;
    }

    //Setter
    public void setSpecies(String species) {
        this.species = species;
    }

    //Getter
    public int getAge() {
        return age;
    }

    //Setter
    public void setAge(int age) {
        this.age = age;
    }
}

//Subclass - Inheritance
class Lion extends Animal {
    //Polymorphism - Overriding
    public Lion(String name, String species, int age) {
        super(name, species, age);
    }
}

//Driver
class Driver {
    public static void main(String[] args) {
        Lion lion = new Lion("Simba", "Lion", 5);
        System.out.println("Name: " + lion.getName());
        System.out.println("Species: " + lion.getSpecies());
        System.out.println("Age: " + lion.getAge());
    }
}