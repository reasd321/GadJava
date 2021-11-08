package c2;

public class FooBarQix {                     //Code Challenge 2
    public String compute2(int x){
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
    public String compute(int x){
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
            while(x!=0){
                if(x%10==3){
                    a=a+"Foo";
                    x=x/10;
                }
                else if(x%10==5){
                    a=a+"Bar";
                    x=x/10;
                }
                else if(x%10==7){
                    a=a+"Qix";
                    x=x/10;
                }
                else
                    return compute2(x);
            }
        }

        return a;
    }
    public static void main(String[]args){ // Adauga logica "compute"
        Main nr = new Main();
        System.out.print(nr.compute(100));
    }
}
