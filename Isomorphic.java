public class Isomorphic {

    public static void main(String[] args) {

        String s = "egg";
        String t = "add";

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        boolean result = true;

        for (int i = 0; i < s.length(); i++) {

            char a = s.charAt(i);
            char b = t.charAt(i);

            if (map1[a] != map2[b]) {
                result = false;
                break;
            }

            map1[a] = i + 1;
            map2[b] = i + 1;
        }

        System.out.println(result);
    }
}