public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Book 1", 100);
        Book book2 = new Book("Book 2", 200);
        Magazine magazine1 = new Magazine("Magazine 1", 50);
        Magazine magazine2 = new Magazine("Magazine 2", 100);

        PageCounter visitor = new PageCounter();

        book1.accept(visitor);
        book2.accept(visitor);
        magazine1.accept(visitor);
        magazine2.accept(visitor);

        System.out.println("Total pages: " + visitor.getTotalPages());
    }
}
