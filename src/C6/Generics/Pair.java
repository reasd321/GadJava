package C6.Generics;

public class Pair <T extends Shoe>{
    private T first;
    private T second;
    public Pair(T first, T second) throws Exception {
        this.first=first;
        this.second=second;
        if(!first.getColor().equals(second.getColor())){
            throw new Exception("Color must match.");
        }

        if(first.getSize()!=second.getSize()){
            throw new Exception("Not the same size.");
        }
    }

    public T getFirst(){
        return first;
    }

    public T getSecond(){
        return second;
    }
}
