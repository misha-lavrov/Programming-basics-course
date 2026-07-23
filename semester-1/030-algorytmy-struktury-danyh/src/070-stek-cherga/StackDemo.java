// Демонстрація: Stack - структура LIFO (Last In, First Out - останній
// зайшов, перший вийшов). Уявіть стос тарілок: кладемо зверху, і беремо
// теж ЗВЕРХУ.

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1); // покласти на верх стосу
        stack.push(2);
        stack.push(3);

        System.out.println("Стек: " + stack);
        System.out.println("Верхній елемент (peek, без видалення): " + stack.peek());

        System.out.println("Знімаємо елементи (pop):");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop()); // виведе 3, 2, 1 - у ЗВОРОТНОМУ порядку додавання
        }

        // Практичне застосування LIFO: розвернути рядок за допомогою стеку
        String word = "привіт";
        Stack<Character> letters = new Stack<>();
        for (char c : word.toCharArray()) {
            letters.push(c);
        }
        StringBuilder reversed = new StringBuilder();
        while (!letters.isEmpty()) {
            reversed.append(letters.pop());
        }
        System.out.println(word + " розвернуто: " + reversed);
    }
}
