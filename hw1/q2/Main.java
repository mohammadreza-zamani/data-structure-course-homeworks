import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];
        int[] result = new int[n];

        // Read the input numbers
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(scanner.next());
        }

        // Stack to keep track of indices for the next greater element search
        Stack<Integer> stack = new Stack<>();

        // Traverse the array from left to right
        for (int i = 0; i < n; i++) {
            // Pop elements from the stack that are smaller than the current element
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                int index = stack.pop();
                result[index] = numbers[i];
            }

            // Push the current element index onto the stack
            stack.push(i);
        }

        // For all the remaining indices in the stack, the next greater element is -1
        while (!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }

        // Print the result
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
