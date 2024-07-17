/* The isBadVersion API is already defined.
      boolean isBadVersion(int version); */
//public class FirstBadVersion extends VersionControl{
//
//    public static int firstBadVersion(int n) {
//
//        if (n == 1) {
//            return 1;
//        }
//        int start = 1;
//        int end = n;
//
//        while (start <= end) {
//
//            int mid = start + (end - start) / 2;
//
//            if (isbadVersion(mid)) {
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//            }
//        }
//        return start;
//    }
//
//}

//VersionControl is an API and isBadVersion is a method in that function
//Input : whole numbers[1,2,3,........n], output : integer
//Using Binary search
//Initialize start and end pointers with 1 and n values respectively
//While loop check (start <= end), find mid and start using isBadVersion method which in built-in function extending VersionControl
//If true then end = mid-1 else start = mid+1
//Finally return start value