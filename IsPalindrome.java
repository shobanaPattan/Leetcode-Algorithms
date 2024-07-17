public class IsPalindrome {

    static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }
        String str = String.valueOf(x);
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {

        int x = 121;

        System.out.println(isPalindrome(x));
    }
}

//Input - integer , output - boolean
//Convert array to integer to string
//Initialize start and end
//Compare start and end char in the converted string
//Return true if all the strings are matched else return false