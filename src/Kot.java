public class Kot extends Pet {

    Kot() {
        System.out.println("Konstruktor kota !!");
        super(5);
    }

    public void miaucz() {
        System.out.println("Miau miau !!");
    }

    @Override
    public void go() {
        System.out.println("coś robię !!");
        super.go();
        System.out.println("Nie chce mi się !!");
    }
}
