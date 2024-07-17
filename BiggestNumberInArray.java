public class BiggestNumberInArray {
    public static void main(String[] args) {
        System.out.println(getBiggestNumber(new int[] {2,4,5,1,6,7}));
    }

    private static int getBiggestNumber(int[] a) {
        int temp = a[0];
        for(int i=1; i<a.length;i++) {
            if(a[i] > temp) {
                temp = a[i];
            }
        }
        return temp;
    }
}
