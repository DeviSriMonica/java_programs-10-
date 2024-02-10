 public class TextJustification {
    public static void main(String[] args) {
        String inputText = "Zoho_Corp_Madurai";
        int desiredLength = 25;

        String justifiedText = justifyText(inputText, desiredLength);

        System.out.println("Justified Text: " + justifiedText);
    }

    private static String justifyText(String inputText, int desiredLength) {
        String[] words = inputText.split("_");

        int totalSpacesToAdd = desiredLength - inputText.length() + (words.length - 1);
        int spacesBetweenWords = totalSpacesToAdd / (words.length - 1);
        int extraSpaces = totalSpacesToAdd % (words.length - 1);

        StringBuilder justifiedText = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            justifiedText.append(words[i]);

            if (i < words.length - 1) {
                for (int j = 0; j < spacesBetweenWords; j++) {
                    justifiedText.append(" ");
                }

                if (extraSpaces > 0) {
                    justifiedText.append(" ");
                    extraSpaces--;
                }
            }
        }

        return justifiedText.toString();
    }
}