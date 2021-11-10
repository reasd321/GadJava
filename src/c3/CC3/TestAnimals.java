package c3.CC3;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.walk();
        d.eat();
        d.play();
        d.setName("Fishy");
        System.out.println("New_fish_name: "+ d.getName());

        System.out.println("\n");

        c.eat();
        c.play();
        c.walk();

        System.out.println("\n");

        a.eat();
        a.walk();

    }
}
