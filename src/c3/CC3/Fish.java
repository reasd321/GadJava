package c3.CC3;

public class Fish extends Animal implements Pet{
    protected String name ;

    public Fish() {
        super(0);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void walk(){
        System.out.println("FISH: I cannot walk");
    }
    public void play(){
        System.out.println("FISH: I cannot play");
    }

    public void eat(){
        System.out.println("FISH: EAT");
    }
}
