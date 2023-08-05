package Memento;

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();

        editor.setContent("A");
        editor.setContent("B");
        editor.setSelectedColor(Color.RED);
        System.out.println("Editor's content before undo : " + editor);
        editor.undo();
        System.out.println("Editor's content after undo : " + editor);
    }
}
