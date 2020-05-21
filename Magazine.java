public class Magazine extends Periodical{

    private boolean pictures;

    public Magazine(String titles, String authors, int numPages, int cost, boolean pictures){
        super(titles, authors, cost, numPages);
        this.pictures = pictures;
    }
    public boolean getPictures(){
        return pictures;
    }
    public void setPictures(boolean pictures){
        this.pictures = pictures;
    }
}