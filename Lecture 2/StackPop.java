 public class StackPop {
    public static void main(String[] args) {

        int stack[] = {10, 20, 30};
        int top = 2;

        System.out.println("Removed: " + stack[top]);

        top--;

        System.out.println("Top element: " + stack[top]);
    }
}