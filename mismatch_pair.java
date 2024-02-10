public class Main {
    public static void main(String[] args) {
        String str1 = "antonyandcleopatra";
        String str2 = "antaniandcleapadra";

        findMismatchedPairs(str1, str2);
    }

    public static void findMismatchedPairs(String str1, String str2) {
        if (str1.length() != str2.length()) {
            System.out.println("Strings must be of equal length.");
            return;
        }

        StringBuilder mismatches = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                mismatches.append(str1.charAt(i)).append(",").append(str2.charAt(i)).append("\n");
            }
        }

        if (mismatches.length() == 0) {
            System.out.println("No mismatched pairs found.");
        } else {
            System.out.println("Mismatched pairs: \n" + mismatches);
        }
    }
}
