public class Exercise1 {

    public static void main(String[] args) {
        String str1 = "This is a test";
        String str2 = "test";
        System.out.println(checkStrings(str1, str2));
    }

    public static boolean checkStrings(String str1, String str2) {
        int index;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(0)) {
                index = 1;
                while (index < str1.length() && i + index < str1.length()) {
                    if (str1.charAt(i + index) == str2.charAt(index))
                        index++;
                    else
                        break;
                    if (index == str2.length())
                        return true;
                }
            }
        }
        return false;
    }
}