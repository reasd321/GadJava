package C4.Beverage;

public class MainD {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Topping milk = new Milk(coffee);
        Beverage whip = new Whip(milk) ;

        System.out.println(whip.getDescription());
        System.out.println(whip.getCost());

        Tea tea= new Tea();
        Beverage teaMilk = new Milk(tea);
        System.out.println(teaMilk.getDescription());
        System.out.println(teaMilk.getCost());
    }
}
