package TextEditor;

public interface Command {
    void execute();
    void undo();
}
