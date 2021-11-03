package c1;

public class c1{
    public static void main(String[]args){
        System.out.println(compute(101));
        compute2();                         // Adauga logica "compute"
    }
    public static String compute2(int x){
        String a = "";
        int n=x;
        while (n!=0) {
            if(n % 10 == 0)
                a = a + "*";
            else a = a + (n%10);
            n = n / 10;
        }
        return a;
    }
    public static String compute(int x){
        String a="";
            if(x%3==0){
                a = "Foo";
                if (x%5==0)
                    a = a+ "Bar";
                if (x%7==0)
                    a = a+ "Qix";
                int n=x;
                while(n!=0){
                    if (n % 10 == 3)
                        a = a + "Foo";
                    if (n % 10 == 5)
                        a = a + "Bar";
                    if (n % 10 == 7)
                        a = a + "Qix";
                    if (n % 10 == 0)
                        a=a+"*";
                    n=n/10;
                }
            }
            else if(x%5==0) {
                a ="Bar";
                if (x%3==0)
                    a = a+ "Foo";
                if (x%7==0)
                    a = a+ "Qix";
                int n = x;
                while (n != 0) {
                    if (n % 10 == 3)
                        a = a + "Foo";
                    if (n % 10 == 5)
                        a = a + "Bar";
                    if (n % 10 == 7)
                        a = a + "Qix";
                    if (n % 10 == 0)
                        a=a+"*";
                    n = n / 10;
                }
            }
            else if(x%7==0) {
                a = "Qix";
                if (x%3==0)
                    a = a+ "Foo";
                if (x%5==0)
                    a = a+ "Bar";
                int n = x;
                while (n != 0) {
                    if (n % 10 == 3)
                        a = a + "Foo";
                    if (n % 10 == 5)
                        a = a + "Bar";
                    if (n % 10 == 7)
                        a = a + "Qix";
                    if (n % 10 == 0)
                        a=a+"*";
                    n = n / 10;
                }
            }
        else{
            int n=x;
            while (n!=0) {
                if(n % 10 == 0)
                    a = a + "*";
                else a = a + (n%10);
                n = n / 10;
            }
        }
        return a;
    }
}

/*public class c1{                // Code challenge 1
    public static void main(String[] args){
        for(int i=1;i<=100;i++){
            if(i%3==0)
                System.out.println("Fizz");
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
}*/

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
