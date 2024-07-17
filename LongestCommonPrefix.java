import java.util.Arrays;

public class LongestCommonPrefix {

    static String commonPrefix(String[] str) {

        StringBuilder result = new StringBuilder();

        Arrays.sort(str);

        String firstString = str[0];
        String lastString = str[str.length - 1];

        for (int i = 0; i < firstString.length(); i++) {

            if (firstString.charAt(i) != lastString.charAt(i)) {
                break;
            } else {
                result.append(firstString.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {

        String[] str = {"cow", "dog", "cat"};

        System.out.println(commonPrefix(str));
    }
}

//Input : Strings of array, output : common string
//Use string builder to mutable the strings
//Sort the arrays
//Assign first and last strings in the array
//Compare each character of first and last string and return the common prefix string