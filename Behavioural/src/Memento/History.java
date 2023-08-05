package Memento;

import java.util.Stack;

public class History {
    Stack<EditorState> stack = new Stack<>();

    public void push(EditorState state) {
        stack.push(state);
    }

    public EditorState pop() {
        var initial = new EditorState("", Color.BLACK);
        if(stack.empty()) return initial;

        stack.pop();
        return !stack.empty() ? stack.peek() : initial;
    }
}
