 import java.util.HashSet;
import java.util.Set;

public class StringPermutations {
    public static void main(String[] args) {
        String input = "Good";
        System.out.println("Input: " + input);
        
        Set<String> permutations = generatePermutations(input);
        
        System.out.println("Output: " + permutations);
    }

    private static Set<String> generatePermutations(String str) {
        Set<String> result = new HashSet<>();
        generatePermutationsHelper("", str, result);
        return result;
    }

    private static void generatePermutationsHelper(String prefix, String remaining, Set<String> result) {
        int n = remaining.length();
        if (n == 0) {
            result.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                String newPrefix = prefix + remaining.charAt(i);
                String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
                generatePermutationsHelper(newPrefix, newRemaining, result);
            }
        }
    }
}

