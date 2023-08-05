package Memento;

public class Editor {
    private String content;
    private Color selectedColor = Color.BLACK;
    private final History history = new History();

    public void undo() {
        var state = history.pop();

        this.content = state.getContent();
        this.selectedColor = state.getSelectedColor();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        history.push(new EditorState(content, selectedColor));
    }

    public Color getSelectedColor() {
        return selectedColor;
    }

    public void setSelectedColor(Color selectedColor) {
        this.selectedColor = selectedColor;
        history.push(new EditorState(content, selectedColor));
    }

    @Override
    public String toString() {
        return "Content : " +  content + ", selected color : " + selectedColor.name();
    }
}
