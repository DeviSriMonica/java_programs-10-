public class StringExpander {
    public static void main(String[] args) {
        String input = "a1b10";
        String output = expandString(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }

    private static String expandString(String input) {
        StringBuilder result = new StringBuilder();
        char currentChar = '\0';
        int count = 0;

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                if (currentChar != '\0') {
                    result.append(String.valueOf(currentChar).repeat(Math.max(0, count)));
                }
                currentChar = c;
                count = 0;
            } else if (Character.isDigit(c)) {
                count = count * 10 + Character.getNumericValue(c);
            }
        }
        if (currentChar != '\0') {
            result.append(String.valueOf(currentChar).repeat(Math.max(0, count)));
        }

        return result.toString();
    }
}
