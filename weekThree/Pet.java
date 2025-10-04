package weekThree;

public class Pet {
    String name;
    String type;
    int age;

    public Pet(String petName, String petType, int petAge) {
        name = petName;
        type = petType;
        age = petAge;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ". I'm a " + type + " and I'm " + age + " years old.");
    }

    public static void main(String[] args) {
        Pet myPet = new Pet("Buddy", "Dog", 5);
        myPet.introduce();
    }
}
