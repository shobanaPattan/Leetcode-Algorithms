public class UniquePaths {

    static int uniquePaths(int m, int n) {

        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
                }
            }
        }
        return arr[m-1][n-1];
    }

    public static void main(String[] args){

       int m =3; int n =7;

        System.out.println(uniquePaths(m,n));
    }
}

//Create two-dimensional array m and n
//Assign value 1 to rows lesser than m rows
//Assign value 1 to columns lesser than n columns
//Find the values for all the rows and columns creating two inner for loops
