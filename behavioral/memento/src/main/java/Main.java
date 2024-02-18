
public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.type("This is the first line.\n");
        editor.printDocument();

        editor.type("This is the second line.\n");
        editor.printDocument();

        editor.type("This is the third line.\n");
        editor.printDocument();

        editor.undo();
        editor.printDocument();

        editor.undo();
        editor.printDocument();

        editor.undo();
        editor.printDocument();

        editor.undo();
    }
}