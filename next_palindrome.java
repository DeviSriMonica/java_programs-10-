public class NextPalindrome {
    public static void main(String[] args) {
        int input1 = 123;
        System.out.println("Input: " + input1);
        System.out.println("Output: " + findNextPalindrome(input1));
 int input2 = 12345;
        System.out.println("\nInput: " + input2);
        System.out.println("Output: " + findNextPalindrome(input2));
    }

    private static int findNextPalindrome(int number) {
        char[] digits = Integer.toString(number).toCharArray();
        int n = digits.length;
        if (allDigitsAreNine(digits)) {
            return (int) Math.pow(10, n) + 1;
        }
        int mid = n / 2;
        boolean leftSmaller = false;
        int i = mid - 1;
        int j = (n % 2 == 0) ? mid : mid + 1;
        while (i >= 0 && digits[i] == digits[j]) {
            i--;
            j++;
        }
        if (i < 0 || digits[i] < digits[j]) {
            leftSmaller = true;
        }
        while (i >= 0) {
            digits[j] = digits[i];
            i--;
            j++;
        }
        if (leftSmaller) {
            int carry = 1;
            mid = (n % 2 == 0) ? mid - 1 : mid;
 while (mid >= 0 && carry > 0) {
                int num = digits[mid] - '0' + carry;
                digits[mid] = (char) ('0' + num % 10);
                carry = num / 10;
                mid--;
            }
        }
  return Integer.parseInt(new String(digits));
    }
 private static boolean allDigitsAreNine(char[] digits) {
        for (char digit : digits) {
            if (digit != '9') {
                return false;
            }
        }
        return true;
    }
}
