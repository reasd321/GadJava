package C5.Visitor;

public class TimeVisitor implements Visitor{
    private int time;
    public void visit(Book book){
        time += book.getNumberOfPages() * 4;
    }

    public void visit(Video video){
        time += video.getTime();
    }

    public void visit(Audio audio){
        time += audio.getTime();
    }

    public String toString(){
        return "Total time : " + time;
    }
}
