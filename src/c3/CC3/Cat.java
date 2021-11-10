package c3.CC3;

public class Cat extends Animal implements Pet{
    protected String name = "";

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat(){
        this("");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void play(){
        System.out.println("Cat: PLAY");
    }

    public void eat(){
        System.out.println("Cat: EAT");
    }
}
