package c2;

/*public class Main{
    private static String contains(int num){
        if(num==0){
            return "";
        }
        int x = num % 10;
        if(x == 3)
            return contains(num/10)+"Foo";
        if(x == 5)
            return contains(num/10)+"Bar";
        if(x == 7)
            return contains(num/10)+"Quix";

        return "";
    }
    public static String fooBarQuix(int num){
        String toReturn = "";
        int ok = 0;
        if (num%3==0)
            toReturn = toReturn + "Foo";
        if (num%5==0)
            toReturn = toReturn + "Bar";
        if (num%7==0)
            toReturn = toReturn + "Quix";

        toReturn = toReturn+contains(num);
        if(toReturn.equals(""))
            return "" + num;
        return toReturn;
    }

    public static void main(String[] args) {
        for(int i=0;i<=53;i++){
            System.out.println(i+ " " + fooBarQuix(i));
        }
    }
}*/

public class Main {
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
    public static void main(String[]args){ // Adauga logica "compute"
        Main nr = new Main();
        System.out.print(nr.compute(2));
    }
}
