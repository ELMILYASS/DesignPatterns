public class PageCounter implements Visitor{
    private int totalPages = 0;

    @Override
    public void visit(Book book) {
        totalPages += book.getPages();
    }

    @Override
    public void visit(Magazine magazine) {
        totalPages += magazine.getPages();
    }

    public int getTotalPages() {
        return totalPages;
    }
}
