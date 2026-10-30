import java.util.*;

class Main {
    public static void main(String[] args) {

        String s1 = "NITIN";

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s1.length(); i++) {
            st.push(s1.charAt(i));
        }

        String s2 = "";

        while (!st.isEmpty()) {
            s2 += st.pop();
        }

        if (s1.equals(s2)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
