package mx.edu.utez;

public class isPalindrome {
    public boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}


