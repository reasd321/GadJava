package C5.exceptions;

import java.io.IOException;

public class Main {
    public static int test(int i) {
        try {
            if(i==0)
                throw new IOException();
            return 0;
        }catch (Exception e){
            return 1;
        }finally {
            return 3;
        }
    }
    public static void main(String[] args) {
        System.out.println(test(0));
    }
}
