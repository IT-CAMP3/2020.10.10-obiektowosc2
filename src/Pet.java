public class Pet extends Mammal {
    String name;
    String race;

    Pet(int a) {
        System.out.println("Konstruktor peta !!");
    }

    Pet(String name) {
        this.name = name;
    }

    public void go() {
        System.out.println("Idę na czterech łapach !!");
    }
}
