
public class Exercise3 {

    public static void main(String[] args) {
        String numString = "052-4019591";
        System.out.println(numberFormat(numString));
    }
// 0501234567 => 050-1234567
// 972501234567 => 050-1234567
// 050-1234567 => 050-1234567


    public static String numberFormat(String st) {
        String correctFormat = "";
        String otherNumbers = "";

        if (st.length() == 12) {
            for (int i = 5; i < st.length(); i++) {
                otherNumbers += (st.charAt(i));
            }
            if (st.charAt(0) == '9' && st.charAt(1) == '7' && st.charAt(2) == '2')
                correctFormat = "0" + st.charAt(3) + st.charAt(4) + "-" + otherNumbers;

        }
        else if (st.length() == 10) {
            for (int i = 3; i < st.length(); i++) {
                otherNumbers += (st.charAt(i));
            }
            if (st.charAt(0) == '0' && st.charAt(1) == '5')
                correctFormat = "0" + st.charAt(1) + st.charAt(2) + "-" + otherNumbers;
        }

        else if (st.length() == 11 && st.charAt(0) == '0' && st.charAt(1) == '5' && st.charAt(3) == '-') {
            correctFormat = st;
        }
        return correctFormat;
    }
}
