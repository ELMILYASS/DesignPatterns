package TextEditor;

public class Main {
    public static void main(String[] args) {
        // Create a TextEditor instance
        TextEditor editor = new TextEditor();

        // Create a TypeCommand instance for typing "Hello, World!"
        Command typeHelloWorld = new TypeCommand(editor, "Hello, World!");

        // Create an EditorInvoker instance and set the command
        EditorInvoker invoker = new EditorInvoker();
        invoker.setCommand(typeHelloWorld);

        // Execute the command
        invoker.executeCommand();
        System.out.println("After typing: " + editor.getText());

        // Undo the last operation
        invoker.undoCommand();
        System.out.println("After undo: " + editor.getText());

        // Redo the last undone operation
        invoker.executeCommand();
        System.out.println("After redo: " + editor.getText());
    }
}
