import java.util.Scanner;

public class Main {

    private static final String[] units = {"", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
            "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
            "nineteen"};

    private static final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty",
            "sixty", "seventy", "eighty", "ninety"};

    private static final String[] thousands = {"", "thousand", "million", "billion", "trillion"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println(convertNumberToWords(number));
    }

    public static String convertNumberToWords(int number) {
        if (number == 0) {
            return "zero";
        }

        String word = "";

        int i = 0;
        do {
            int num = number % 1000;
            if (num != 0) {
                word = convertLessThanOneThousand(num) + thousands[i] + " " + word;
            }
            number /= 1000;
            i++;
        } while (number > 0);

        return word.trim();
    }

    private static String convertLessThanOneThousand(int number) {
        String current;

        if (number % 100 < 20) {
            current = units[number % 100];
            number /= 100;
        } else {
            current = units[number % 10];
            number /= 10;

            current = tens[number % 10] + " " + current;
            number /= 10;
        }
        if (number == 0) {
            return current;
        }
        return units[number] + " hundred" + (current.isEmpty() ? "" : " and " + current);
    }
}
