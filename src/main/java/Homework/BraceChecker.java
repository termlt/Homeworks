package Homework;

import java.util.Stack;

public class BraceChecker {
    private final String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            } else if (c == ']' || c == ')' || c == '}') {
                if (stack.isEmpty()) {
                    System.out.println("Failed");
                    return;
                }

                char top = stack.pop();

                if ((c == ']' && top != '[') || (c == ')' && top != '(') || (c == '}' && top != '{')) {
                    System.out.println("Failed");
                    return;
                }
            }
        }

        if (!stack.isEmpty()) {
            char top = stack.pop();
            System.out.println("Failed");
        } else {
            System.out.println("Correct");
        }
    }

    public static void main(String[] args) {
        String str = "Hello from Java{s}";
        BraceChecker bc = new BraceChecker(str);
        bc.check();
    }
}
