public class ValidPalindrome {

    static boolean validPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String str = "ba";

        System.out.println(validPalindrome(str));
    }
}

//input - Strings, output - boolean
//Take two pointers approach left (0) and right (length-1)
//While loop until left < right
//Check each char of the string taking left and right pointers and increase left++ and right--
//If all character matches then return true else false