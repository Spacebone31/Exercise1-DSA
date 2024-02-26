//Superclass - Inheritance
public class Animal {
    //Encapsulation
    private String name;
    private String species;
    private int age;
    private String sound;

    public Animal(String name, String species, int age, String sound) {
        //Constructor
        this.name = name;
        this.species = species;
        this.age = age;
        this.sound = sound;
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

    //Getter
    public String getSound() {
        return sound;
    }

    //Setter
    public void setSound(String sound) {
        this.sound = sound;
    }
}

//Subclass - Inheritance
class Fish extends Animal {
    //Polymorphism - Overriding
    public Fish(String name, String species, int age, String sound) {
        super(name, species, age, sound);
    }
}

//Driver
class Driver {
    public static void main(String[] args) {
        Fish fish = new Fish("Nemo", "Fish", 5, "Blub... Blub... Blub...");
        System.out.println("Name: " + fish.getName());
        System.out.println("Species: " + fish.getSpecies());
        System.out.println("Age: " + fish.getAge());
        System.out.println("Sound: " + fish.getSound());
    }
}