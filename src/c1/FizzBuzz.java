package c1;

public class FizzBuzz{                // Code challenge 1
    public void Fizz(){
        for(int i=1;i<=100;i++){
            if(i%3==0)
                System.out.println("Fizz ");
            else if (i%5==0)
                System.out.println("Buzz");
            else if (i%5==0 && i%3==0)
                System.out.println("FizzBuzz");
            else if (i%7==0)
                System.out.println("Rizz");
            else if (i%11==0)
                System.out.println("Jazz");
            else
                System.out.println(i);
        }
    }
    public static void main(String[] args){
        c1 x = new c1();
        x.Fizz();
    }
}