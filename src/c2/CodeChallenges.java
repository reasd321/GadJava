package c2;

public class CodeChallenges {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("f1",100,10);
        Fighter f2 = new Fighter("f1",100,10);
        BoxingMatch boxingMatch = new BoxingMatch(f1,f2);
        System.out.println("Winner : " + boxingMatch.fight());
        System.out.println("Number of fighters =" + f1.getNumberofFighters());
    }
}
