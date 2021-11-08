package c3;

public class Pair_of_2 {
    public static int count(int[] x){
        int nr;
        return nr=x.length;
        /*for(int i=0;i<nr;i++){
            for(int j=i;j<nr;j++){
                if(x[i]==x[j])
                    nr--;
            }
        }
        return nr;*/
    }
    public static void main(String[] args) {
        int[] x={1,1,0,-1,-1};
        int nr=count(x);
        if (nr%2==0)
            System.out.print(count(x)/2);
        else
            System.out.print((count(x)-1)/2);
    }
}
