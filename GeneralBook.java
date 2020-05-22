public class GeneralBook extends Book implements Loanable{

    public GeneralBook(final String titles, final Authors authors, final int bookTotal, final String genre, final int pages) {
        super(titles, authors, pages, bookTotal, genre);
    }

    @Override
    public boolean isLoanable() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public double loanFee() {
        // TODO Auto-generated method stub
        return 2.00;
    }

    @Override
    public Schedule feeSchedule() {
        // TODO Auto-generated method stub
        return Schedule.WEEKLY;
    }
}