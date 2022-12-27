public class Main {
    public static void main(String[] args) {
        String string = "Анна";
        System.out.println(isPalindrom(string));
    }

    public static boolean isPalindrom(String text) {
        text = text.replace(" ", "");
        text = text.toLowerCase();
        for (int i = 0; i < text.length()/2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}