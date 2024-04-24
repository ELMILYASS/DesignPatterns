package TextEditor;

public class TextEditor {
    private StringBuilder text = new StringBuilder();

    public void type(String text) {
        this.text.append(text);
    }

    public void deleteLastCharacters(int count) {
        this.text.delete(this.text.length() - count, this.text.length());
    }

    // Method to retrieve the current text
    public String getText() {
        return text.toString();
    }

}
