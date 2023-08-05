package Memento;

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();

        editor.setContent("A");
        editor.setContent("B");
        System.out.println("Editor's content before undo : " + editor.getContent());
        editor.undo();
        System.out.println("Editor's content after undo : " + editor.getContent());
    }
}
