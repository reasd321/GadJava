package C5.exceptions;

import java.io.IOException;

public class Main {
    public static int test(int i) {
        try {
            if(i==0)
                throw new IOException();
            System.out.println("here1");

            return 0;
        }catch (Exception e){
            System.out.println("here2");
            return 1;
        }finally {
            System.out.println("here3");
            //return 2; // nu este indicat sa returnam in "finally"
        }
    }
    public static void main(String[] args) {
        System.out.println(test(0));
        System.out.println();
        System.out.println(test(1));
    }
}
