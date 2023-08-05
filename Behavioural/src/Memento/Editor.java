package Memento;

import java.util.Stack;

public class Editor {
    private String content;
    private Color selectedColor;
    Stack<String> contentHistory = new Stack<>();
    Stack<Color> colorHistory = new Stack<>();

    public void undo() {
        if(contentHistory.empty()) return;

        contentHistory.pop();
        this.content = contentHistory.empty() ? "" : contentHistory.peek();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        contentHistory.push(content);
        this.content = content;
    }

    public Color getSelectedColor() {
        return selectedColor;
    }

    public void setSelectedColor(Color selectedColor) {
        colorHistory.push(selectedColor);
        this.selectedColor = selectedColor;
    }
}
