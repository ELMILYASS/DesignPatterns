import java.util.LinkedList;

class Editor {
    private final Document document;
    private final LinkedList<Document.Memento> history;

    public Editor() {
        document = new Document();
        history = new LinkedList<>();
    }

    public void type(String text) {
        document.setContent(text);
        history.push(document.save());
    }

    public void undo() {
        if (!history.isEmpty()) {
            Document.Memento memento = history.pop();
            document.restore(memento);
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    public void printDocument() {
        System.out.println("Document content: " + document.getContent());
    }
}