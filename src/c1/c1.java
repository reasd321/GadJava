package c1;



public class c1{                // Code challenge 1
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

/*public class c1{
    public void arrays(){
        char [] copyFrom = {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
        char [] copyTo = new char[7];

        System.arraycopy(copyFrom,2,copyTo,0,7); //(length = cate caractere sa copieze)
        System.out.println(new String (copyTo));
    }
}*/

/*public class c1 {
    public static void main (String[] args) {
        int x = 0;
        while (x++ < 10){
        }
        checkForXValue(x);

    }

    private static void checkForXValue(int x) {
        int expectedXValue = 11;

        System.out.println("Guessed correctly the value of x ? -"+(x == expectedXValue));
    }
}*/
