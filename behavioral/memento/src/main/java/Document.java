public class Document {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public Memento save() {
        return new Memento(this.content);
    }

    public void restore(Memento memento) {
        this.content = memento.getContent();
    }

    // Memento class
    public static class Memento {
        private final String content;

        private Memento(String content) {
            this.content = content;
        }

        private String getContent() {
            return content;
        }
    }
}
