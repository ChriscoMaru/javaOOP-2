public class Book extends LibraryItem {
        private int pages;
        private String genre;
    
        public Book(String title, String authors, int pages, int cost, String genre) {
            super(title, authors, cost);
            this.pages = pages;
            this.genre = genre;
        }
    
        public int getPages() {
            return pages;
        }
    
        public void setPages(int pages) {
            this.pages = pages;
        }
        public String getGenre(){
            return genre;
        }
        public void setGenre(String genre){
            this.genre = genre;
        }
    
    }
