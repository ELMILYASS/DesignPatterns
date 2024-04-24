public class Magazine implements Visitable{
    private String title;
    private int pages;

    public Magazine(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}


