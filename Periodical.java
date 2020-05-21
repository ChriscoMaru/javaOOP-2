public class Periodical extends LibraryItem{
    
    private int numPages;

    public Periodical(String title, String author, int cost, int numPages){
        super(title, author, cost);
        this.numPages = numPages;
    }

    public int getnumPages(){
        return numPages;
    }

    public void setnumPages(int numPages){
        this.numPages = numPages;
    }
}