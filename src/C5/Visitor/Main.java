package C5.Visitor;

public class Main {
    public static void main(String[] args) {
        Element[] elements = new Element[10];
        Book book1 = new Book("Book1",300,50);
        Book book2 = new Book("Book2",200,34);

        elements[0]=book1;
        elements[1]=book2;

        Video video1 = new Video("Video1",100,200);
        Video video2 = new Video("Video2",50,180);

        elements[2]=video1;
        elements[3]=video2;

        Audio audio1 = new Audio("Audio1",250,150);
        Audio audio2 = new Audio("Audio2",300,70);

        elements[4]=audio1;
        elements[5]=audio2;

        for(int i=0;i< elements.length && elements[i]!=null ;i++){
            System.out.println(elements[i]);
        }

        Visitor priceVisitor = new PriceVisitor();
        for(Element currentElement : elements){
            if(currentElement!=null) {
                currentElement.accept(priceVisitor);
            }
        }

        System.out.println(priceVisitor);

        Visitor timeVisitor = new TimeVisitor();
        for(Element currentElement : elements){
            if(currentElement!=null){
                currentElement.accept(timeVisitor);
            }
        }

        System.out.println(timeVisitor);
    }
}
