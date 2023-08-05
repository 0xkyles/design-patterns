package Memento;

import java.util.Stack;

public class Editor {
    private String content;
    private Color selectedColor = Color.BLACK;
    Stack<EditorState> history = new Stack<>();

    public void undo() {
        if(history.empty()) return;

        history.pop();
        content = history.empty() ? "" : history.peek().getContent();
        selectedColor = history.empty() ? Color.BLACK : history.peek().getSelectedColor();
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
