public class StringMismatch {
    public static void main(String[] args) {
        String str1 = "AABBCCDD";
        String str2 = "ABCDCCAD";

        System.out.println("Input: " + str1 + ", " + str2);
        
        findMismatchedSubstrings(str1, str2);
    }

    private static void findMismatchedSubstrings(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                int j = i + 1;
                while (j < minLength && str1.charAt(j) != str2.charAt(j)) {
                    j++;
                }
                System.out.println(str1.substring(i, j) + "," + str2.substring(i, j));
                i = j - 1;
            }
        }
    }
}
