import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements in the heap
        int elementCount = Integer.parseInt(scanner.nextLine());
        List<Integer> heap = new ArrayList<>();

        // Read the elements into the list
        for (int i = 0; i < elementCount; i++) {
            heap.add(Integer.parseInt(scanner.nextLine()));
        }

        // Check if the list represents a valid max-heap
        System.out.println(isValidMaxHeap(heap) ? "YES" : "NO");
    }

    /**
     * Checks if the given list represents a valid max-heap.
     *
     * @param heap the list to check
     * @return true if the list represents a valid max-heap, false otherwise
     */
    public static boolean isValidMaxHeap(List<Integer> heap) {
        return isValidMaxHeapRecursive(heap, 0);
    }

    /**
     * Recursively checks if the subtree rooted at the given index satisfies the max-heap property.
     *
     * @param heap  the list representing the heap
     * @param index the root index of the subtree to check
     * @return true if the subtree satisfies the max-heap property, false otherwise
     */
    private static boolean isValidMaxHeapRecursive(List<Integer> heap, int index) {
        int size = heap.size();
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;

        // If the node is a leaf, it's valid
        if (index >= size / 2) {
            return true;
        }

        boolean isLeftValid = leftChildIndex >= size || heap.get(index) >= heap.get(leftChildIndex);
        boolean isRightValid = rightChildIndex >= size || heap.get(index) >= heap.get(rightChildIndex);

        return isLeftValid 
                && isRightValid 
                && isValidMaxHeapRecursive(heap, leftChildIndex) 
                && isValidMaxHeapRecursive(heap, rightChildIndex);
    }
}
