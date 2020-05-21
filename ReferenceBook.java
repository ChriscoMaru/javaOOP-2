public class ReferenceBook extends Book{

    private String subject;
    
    public ReferenceBook(String title, String author, int cost, String genre, int pages, String subject){
        super(title, author, pages, cost, genre);
        this.subject = subject;
    }
    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
}