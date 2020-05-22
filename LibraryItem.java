public class LibraryItem {

    private String title; 
    private Authors author;
    private int cost;

    public LibraryItem(String titles, Authors authors, int cost) {
        this.title = titles;
        this.author = authors;
        this.cost = cost;

    }

    // getters
    public String getTitles() {
        return title;
    }

    public Authors getAuthors() {
        return author;
    }

    public int getBookTotal() {
        return cost;
    }

    // setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String authors) {
        this.author = authors;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

}