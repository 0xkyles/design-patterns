package Memento;

import java.util.Stack;

public class Editor {
    private String content;
    private String title;
    Stack<String> stack = new Stack<>();

    public void undo() {
        if(stack.empty()) return;

        stack.pop();
        this.content = stack.empty() ? "" : stack.peek();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        stack.push(content);
        this.content = content;
    }
}
