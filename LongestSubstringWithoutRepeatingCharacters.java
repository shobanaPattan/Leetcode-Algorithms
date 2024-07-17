import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    static int maxLength(String str) {

        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < str.length(); right++) {

            if (!set.contains(str.charAt(right))) {
                set.add(str.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (set.contains(str.charAt(right))) {
                    set.remove(str.charAt(left));
                    left++;
                }
                set.add(str.charAt(right));
            }
        }
        return maxLength;
    }

    public static void main(String[] args){

        String str = "pwwkew";

        System.out.println(maxLength(str));
    }
}

//input - string, output - integer
//Create a HashSet
//Initialize left and maxLength values to 0
//For loop to access each character in the string
//Check until right variable reaches the duplicate, then start removing all the characters from left pointers
//Return maxLength