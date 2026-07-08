package lecture16_String_Important;

public class string_compression {
    public static void main(String[] args) {
        String s1 = "Ankitaa";
        String s2 = "Ankita";
//        numeric valule return krega kyuki jaha par character mismatch kiya h vha uski difference ascii value deta h aur jab s2>s1 the it will return difference of length
        System.out.print(compare(s1, s2));
    }

    public static int compare(String s1, String s2) {
        if (s1 == s2) {
            return 0;
        }
        int n = Math.min(s1.length(), s2.length());
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) - s2.charAt(i);
            }
        }
        return s1.length() - s2.length();

    }
}
