import java.util.Scanner;

public class Prac20 {
    private int[] data;
    private int top;

    public Prac20(int size) {
        data = new int[size];
        top = -1;
    }

    public void push(int value) {
        data[++top] = value;
    }

    public int pop() {
        return data[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();
        Prac20 stack = new Prac20(size);


        System.out.println("Enter the elements of the stack:");
        for (int i = 0; i < size; i++) {
            int value = scanner.nextInt();
            stack.push(value);
        }

        System.out.println("Elements in the stack:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
