public class ReferenceBook extends Book implements Loanable{

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

    @Override
    public boolean isLoanable() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public double loanFee() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Schedule feeSchedule() {
        // TODO Auto-generated method stub
        return null;
    }
}