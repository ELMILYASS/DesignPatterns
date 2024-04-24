package TextEditor;

public class TypeCommand implements Command{
    private TextEditor editor;
    private String text;

    public TypeCommand(TextEditor editor, String text) {
        this.editor = editor;
        this.text = text;
    }

    @Override
    public void execute() {
        editor.type(text);
    }

    @Override
    public void undo() {
        editor.deleteLastCharacters(text.length());
    }
}
