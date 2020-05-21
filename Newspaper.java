public class NewsPaper extends Periodical{
    
    private boolean tabloid;

    public NewsPaper(String title, String author, int cost, int numPages, boolean tabloid) {
        super(title, author, cost, numPages);
        
        this.tabloid = tabloid;
    }
    public boolean getTabloid(){
        return tabloid;
    }
    public void setTabloid(boolean tabloid){
        this.tabloid = tabloid;
    }


}