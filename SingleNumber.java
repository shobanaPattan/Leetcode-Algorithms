public class SingleNumber {

    static int findSingleNumber(int[] arr) {

        int result = 0;

        for (int i = 0; i < arr.length; i++) {

            result = result ^ arr[i];

        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {4, 2, 1, 2, 1};

        System.out.println(findSingleNumber(arr));
    }
}

//Input - array, output - int
//Single number - find the non-repeating number in an array
//Initialise a variable and assign value as 0
//for whole to access every number in an array
//Use XOR operation