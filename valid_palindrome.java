public class CharacterCheck {
    public static void main(String[] args) {
        String input1 = "malayalam";
        String input2 = "m@al$a$y*a&lam";
        String input3 = "Something";

        System.out.println("Input 1: " + isValidInput(input1));
        System.out.println("Input 2: " + isValidInput(input2));
        System.out.println("Input 3: " + isValidInput(input3));
    }

    private static boolean isValidInput(String input) {
        // Using a regular expression to check if the input contains only letters and spaces
        return input.matches("^[a-zA-Z ]+$");
    }
}