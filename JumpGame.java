public class JumpGame {

    static boolean jumGame(int[] arr){

        int replaceable = 0;

        for(int i = 0; i< arr.length; i++){

            if(i>replaceable){
                return false;
            }

            replaceable = Math.max(replaceable, i+arr[i]);
        }
        return true;
    }

    public static void main(String[] args){

        int[] arr = {2,3,1,1,4};

        System.out.println(jumGame(arr));
    }
}

//Input - array , output - boolean
//Initialize replaceable to 0
//For loop to encounter each element in an array
//Condition check if i>replaceable if yes return false
//find replaceable = math.max(replaceable , i+arr[i])
//end for loop and return true
