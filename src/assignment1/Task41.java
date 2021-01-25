package assignment1;

public class Task41 {
    public static void main(String argu[]) {

        String str = "Garima";
        int count = 0;
        char[] dup = str.toCharArray();
        System.out.println("Duplicate Characters are:");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (dup[i] == dup[j]) {
                    System.out.println(dup[j]);
                    count++;
                    break;
                }
            }
        }
    }
}
