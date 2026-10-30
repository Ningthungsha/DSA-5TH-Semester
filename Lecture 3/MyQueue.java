import java.util.*;

public class MyQueue {
    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50,60,70,80,90,100};

        Queue<Integer> q = new java.util. LinkedList<>();

        for(int i = 0; i < arr.length; i++) {
            q.add(arr[i]);
        }

        System.out.println(q.peek());

        q.remove();
        q.remove();
        q.remove();
        q.remove();

        System.out.println(q.peek());
    }
}