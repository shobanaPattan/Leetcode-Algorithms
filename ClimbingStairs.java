public class ClimbingStairs {

    public static int numberOfWays(int n) {

        if (n <= 3) {
            return n;
        }

        int previous = 3;
        int previous2 = 2;
        int curr = 0;

        for (int i = 3; i < n; i++) {
            curr = previous2 + previous;
            previous2 = previous;
            previous = curr;
        }
        return curr;
    }

    public static void main(String[] args){

        int n = 4;

        System.out.println(numberOfWays(n));
    }
}

//Time : 0(n) , Space = 0(1)
//Input : Integer(n), Output : Integer
//Initialise las two previous numbers and current number
//for loop to access each number where loop starts with i = 3
//start adding last two previous numbers and assign to curr variable
//return curr value