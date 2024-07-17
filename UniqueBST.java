public class UniqueBST {

    static int uniqueBST(int n) {

        //With recursion
//        if (n <= 1) {
//            return 1;
//        }
//
//        int ans = 0;
//
//        for (int i = 1; i <= n; i++) {
//
//            ans += uniqueBST(i - 1) * uniqueBST(n - i);
//
//        }
//        return ans;

        //Without Recursion
        int[] G = new int[n + 1];

        G[0] = G[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                G[i] = G[i] + G[j - 1] * G[i - j];
            }
        }

        return G[n];
    }

    public static void main(String[] args) {

        int n = 4;

        System.out.println(uniqueBST(n));
    }
}

//Check if n <= 1 then return 1
//Apply for loop for i and n values
//ans+ = (i-1) * (n-i)
//Without recursion  G[i] = G[i] + G[j - 1] * G[i - j];