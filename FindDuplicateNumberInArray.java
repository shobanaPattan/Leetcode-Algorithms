public class FindDuplicateNumberInArray {

    static int findDuplicate(int[] arr){

        int slow = arr[0];
        int fast = arr[0];

        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while (slow != fast);

        slow = arr[0];

        while(slow != fast){
            slow = arr[slow];
            fast = arr[fast];
        }

        return slow;
    }

    public static void main(String[] args){

        int[] arr = {3,1,3,4,2};

        System.out.println(findDuplicate(arr));
    }
}

//Input -array, output - integer, time - 0(n), space - 0(1)
//Method - do while loop and while loop to find the duplicate number in an array
//initialize slow and fast variables to arr[0]
//do loop until slow != fast(t00 fast)
//while loop (slow down)