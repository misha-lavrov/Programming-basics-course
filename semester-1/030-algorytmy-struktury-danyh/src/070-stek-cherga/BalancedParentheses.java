// Самостійний челендж: перевірка збалансованості дужок - класична задача,
// яку розв'язують саме через Stack. Приклад: "(a+b)*(c-d)" - збалансовано;
// "(a+b(" - НЕ збалансовано.
//
// Ідея: коли зустрічаємо відкриваючу дужку - кладемо в стек. Коли зустрічаємо
// закриваючу - знімаємо верхню з стеку і перевіряємо, чи вона відповідна.

import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        System.out.println(isBalanced("(a+b)*(c-d)")); // true
        System.out.println(isBalanced("(a+b(")); // false
        System.out.println(isBalanced("())")); // false
    }

    static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false; // закриваюча дужка без відповідної відкриваючої
                }
                stack.pop();
            }
        }

        return stack.isEmpty(); // якщо стек порожній - усі дужки знайшли пару
    }
}
