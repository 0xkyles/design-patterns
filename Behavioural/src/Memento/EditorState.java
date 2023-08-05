package Memento;

public class EditorState {
    private final String content;
    private final Color selectedColor;

    public EditorState(String content, Color selectedColor) {
        this.content = content;
        this.selectedColor = selectedColor;
    }

    public Color getSelectedColor() {
        return selectedColor;
    }

    public String getContent() {
        return content;
    }
}
