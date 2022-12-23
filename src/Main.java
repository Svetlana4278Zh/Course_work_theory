public class Main {
    public static void main(String[] args) {
        String string = "А роза упала на лапу Азора";
        System.out.println(isPalindrom(string));
    }

    public static boolean isPalindrom(String text) {
        text = text.replace(" ", "");
        text = text.toLowerCase();
        boolean palindrom = true;
        for (int i = 0; i < text.length()/2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                palindrom = false;
            }
        }
        return palindrom;
    }
}