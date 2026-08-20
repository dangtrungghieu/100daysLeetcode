public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.print(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        String str = s.toLowerCase().trim();// String la chuoi bat bien khong thao tac truc tiep duoc
        char[] chars = new char[str.length()];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((int) str.charAt(i) >= 97 && (int) str.charAt(i) <= 122 || (int) str.charAt(i) >= 48 && (int) str.charAt(i) <= 57) {
                chars[index] = str.charAt(i);
                index++;
            }
        }
        if (chars.length < 2) {
            return true;
        }
        int left = 0;
        int right = index - 1;
        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
