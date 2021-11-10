package c3.CC3;

abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public abstract void eat();
    public void walk(){
        System.out.println("I can walk and i have "+legs+" legs");
    }
}
