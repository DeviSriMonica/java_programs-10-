 import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase(); // Convert input to lowercase to handle both uppercase and lowercase vowels
        scanner.close();

        int[] vowelsCount = new int[5]; // Array to store counts for 'a', 'e', 'i', 'o', 'u'

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            switch (ch) {
                case 'a':
                    vowelsCount[0]++;
                    break;
                case 'e':
                    vowelsCount[1]++;
                    break;
                case 'i':
                    vowelsCount[2]++;
                    break;
                case 'o':
                    vowelsCount[3]++;
                    break;
                case 'u':
                    vowelsCount[4]++;
                    break;
            }
        }

        // Print the counts
        System.out.println("a:" + vowelsCount[0]);
        System.out.println("e:" + vowelsCount[1]);
        System.out.println("i:" + vowelsCount[2]);
        System.out.println("o:" + vowelsCount[3]);
        System.out.println("u:" + vowelsCount[4]);
    }
}